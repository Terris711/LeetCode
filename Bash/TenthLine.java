package Bash;

public class TenthLine {
    # Read from the file file.txt and output the tenth line to stdout.
    sed "10q;d" file.txt
}
