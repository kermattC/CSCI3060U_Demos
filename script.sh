# change directory to Test Files
cd "stuff"

echo "Starting Script..."

# iterate through each file to run the java class
for dir in *; do
	cd $dir
	echo "Running hello world program for $dir"
	# run the java class in the root directory while passing the user accounts file and rental units file. Also directs data from inputs.txt into the program using < and directs output using >
	java -classpath ../../ HelloWorld ../../file1.txt ../../file2.txt < inputs.txt > terminal-output.txt
	cd ..
done


# using diff to compare each file
# based on the files I created, the first diff should pass and the second diff should fail
for dir in *; do
	cd $dir
	echo "Checking difference for $dir"
	# diff will return nothing if the files are the same
	diff demo_output.txt expected_outputs.txt
	cd ..
done
