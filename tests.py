import os

def test(dir_name):
    print(f"testing {dir_name}")
    for f in os.listdir(dir_name):
        print(f"testing {f}")
        os.system(f"java lab11_05_14.Main -i {dir_name}/{f}")

dirs=("failure/static-semantics","failure/static-semantics-only","failure/syntax","success")

for dir in dirs:
    test(f"tests/{dir}")
