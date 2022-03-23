# CSCI3060U_Demo
Demo code for CSCI 3060U course

# Shell Script Branch
How to run the shell script

Note that this script is written to work for THIS directory structure. If your directory structure is different, or if you have the script file saved elsewhere, you'll have to navigate it by using / and/or ../

## HelloWorld class
This is a basic java class that does the following:
- upon running the java class, it expects to take in 2 arguments (meant to simulate taking in the user accounts and available rental units file)
- read the files passed into arguments and display it to the console
- take in 3 inputs via redirection

## Running the script file
If you're on linux or windows subsystem, you can use:

./script.sh

On windows, just add bash in front and remove the ./:

bash script.sh

In case you're getting errors such as $'\r' command not found, you'll have to convert the text from dos-based to unix-based. Here are two ways to fix this:

1) If you're on linux or windows subsystem, this can be done via:

```
sed -i 's/\r$//' script.sh
```

(replace the script.sh with your own file name)

2) Use notepad++
	i) go to search -> find in files
	ii) directory -> working directory
	iii) find what = \r\n
	iv) replace with =\n
	v) search mode = extended
	vi) click "Replace in Files"

	StackOverflow link for reference: 
	https://stackoverflow.com/questions/20368781/anything-like-dos2unix-for-windows\




