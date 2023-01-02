import os
from argparse import ArgumentParser
from pathlib import Path


if __name__ == "__main__":
    # Initialize `argparse`
    parser: ArgumentParser = ArgumentParser(
        prog="Script for cloning files with a different file extension",
        description="Creates a new files with a different extension")
    parser.add_argument("-f", "--FilePath", type=Path)
    parser.add_argument(
        "-i",
        "--input_file_extension",
        help="The extension of the file used as input.")
    parser.add_argument(
        "-o",
        "--output_file_extension",
        help="The extension of the file used as output.")

    args = parser.parse_args()
    # Save flags from CLI
    input_file_extension: str = args.input_file_extension
    output_file_extension: str = args.output_file_extension
    path: str = args.FilePath

    # Traverse the files with the given path
    for (
        root,
        dirs,
        files,
    ) in os.walk(path):
        for file_name in files:
            # If the file has the extension `input_file_extension`
            if file_name.endswith(input_file_extension):
                current_file_path: str = os.path.join(root, file_name)
                # The new path of the new file
                new_file_path: str = current_file_path.replace(
                    f".{input_file_extension}", f".{output_file_extension}")
                with open(current_file_path) as current_file:
                    # Retrieve the first line of the file, since it's the name
                    # of the problem.
                    problem_name: str = current_file.readlines()[0]
                    with open(new_file_path, "x") as new_file:
                        new_file.write(problem_name)
                        print("File created -> " + new_file_path)

    print("Success!")
