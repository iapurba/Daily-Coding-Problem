def build_fs(input):
    fs = {}
    files = input.split('\n')

    current_path = []
    for f in files:
        indentation = 0
        while '\t' in f[:2]:
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

print(build_fs("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"))