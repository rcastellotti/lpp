import os

def test(dir_name, ntc = False):
    print(f"===| Testing files in the directory {dir_name} |===")
    for f in os.listdir(dir_name):
        if f != 'ntc':
            print(f"===| Testing {f} {'with ntc' if ntc else ''} |===")
            os.system(f"java lpp.Main {'-ntc' if ntc else ''} -i {dir_name}/{f}")

dirs=(  ("failure/ntc", True),
        ("failure/syntax", False),
        ("failure/type", False),
        ("failure/syntax", False),
        ("success/ntc",  True),
        ("success", False)
    )

for dir, type_check in dirs:
    test(f"tests/{dir}", ntc= type_check)

print("===| Ended Tests |===")