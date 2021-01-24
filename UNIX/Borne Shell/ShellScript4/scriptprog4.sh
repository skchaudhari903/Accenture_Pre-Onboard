read n
sd=0
rev=0

if [ $n -lt 0 ]
    then echo "Not a positive number"
    exit
fi

while [[ $n -gt 0 ]]
do
    sd=$(( $n%10 ))
    rev=$(( $rev*10 + $sd ))
    n=$(( $n/10))
done
echo "Reverse number is $rev"