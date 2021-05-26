import os

def test(dir_name, ntc = False):
    print(f"testing {dir_name}")
    for f in os.listdir(dir_name):
        if f != 'ntc':
            print(f"testing {f}")
            os.system(f"java lab11_05_14.Main -i {dir_name}/{f}")

dirs=("failure/ntc", "failure/syntax","failure/type","failure/syntax","success/tc", "success")

for dir in dirs:
    test(f"tests/{dir}")
