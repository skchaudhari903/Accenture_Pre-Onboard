for f in ${*}
do
if [ -e $f ]; then
    echo "File Exists!"
    if [ -w $f ] && [ -r $f ]; then
        chmod a=rwx $f && echo "File Permission has been changed"
        fi
    else
        echo "File does not Exist" && exit
    fi
    done