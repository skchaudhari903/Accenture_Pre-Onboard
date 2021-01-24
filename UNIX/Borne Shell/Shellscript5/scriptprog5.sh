read a
s=0
if [ $a -lt 0 ]
then
echo "Not a positive number"
else
while [[ $a -gt 0 ]]
do
    k=$(( $a%10 ))
    a=$(( $a/10 ))
    s=$(( $k + $s))
done
echo "Sum of digit for given number is $s"
fi 