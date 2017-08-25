SUCCESS=0
username=$1
password=$2
	# Check if user already exists.
	grep -q "$username" /etc/passwd
	if [ $? -eq $SUCCESS ] 
	then	
	echo "User $username does already exist."
  	echo "please choose another username."
	exit $E_USEREXISTS
	fi  
	adduser  "$username"
        echo "$2" | passwd  "$username"  --stdin
        
	echo "the account is setup"
exit 0
