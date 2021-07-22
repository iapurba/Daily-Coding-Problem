#!/usr/bin/env python3


def build_fs(input):
    fs = {}
    files = input.split("\n")

    current_path = []

    for f in files:
        indentation = 0
        while "\t" in f[:2]:
            indentation += 1
            f = f[1:]

        current_node = fs

        for subdir in current_path[:indentation]:
            current_node = current_node[subdir]

        if '.' in f:
            current_node[f] = True
        else:
            current_node[f] = {}

        current_path = current_path[:indentation]
        current_path.append(f)

    return fs


def longest_path(fs):
    paths = []
    for key, val in fs.items():
        if val == True:
            paths.append(key)
        else:
            paths.append(key + '/' + longest_path(val))

    paths = [path for path in paths if '.' in path]

    if paths:
        return max(paths, key=lambda path: len(path))
    else:
        return ''


def longest_absolute_path(s):
    return(longest_path(build_fs(s)))


if __name__ == "__main__":
    s1 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
    s2 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"

    print(longest_absolute_path(s1))
    print(longest_absolute_path(s2))
