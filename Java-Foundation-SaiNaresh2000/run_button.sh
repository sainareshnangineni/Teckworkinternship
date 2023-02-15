#######################################
#   Configuration for Run Button      #
#######################################

# Provide the name of the directory (assignment or project name)
cd operators

# Java compile command. Do not change this. 
javac maxNum.java

#This is the main class you want to run. 
#This needs to change every time you want to run a #Java File. 
java maxNum

#######################################
#   Configuration for GitHub          #
#######################################
# This is a ONE TIME SETUP ONLY
# Configure these variables
EMAIL="sagarchowdary2000@gmail.com"
NAME="Nangineni Sai Naresh"
GITHUB_USERNAME="sainareshnangineni"
GITHUB_ACCESS_TOKEN="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"

#######################################
#   DO NOT CHANGE ANYTHING BELOW      #
#######################################

#git configuration below make using IDE easy.
git config --global --replace-all user.email $EMAIL
#enter your name
git config --global --replace-all user.name $NAME

#create ~/.netrc file
# This .netrc file is used to store your username and your Perosnal Access Token
FILE1=~/.netrc
if test -f "$FILE1"; then
    rm $FILE1
fi

echo machine github.com login $GITHUB_USERNAME password $GITHUB_ACCESS_TOKEN  > $FILE1




