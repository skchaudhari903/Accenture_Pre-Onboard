for f in ${*}
do
    [ -w $f ] && W="Write : yes" || W="Write : no"
    [ -x $f ] && X="Execute : yes" || X="Execute : no"
    [ -r $f ] && R="Read : yes " || R="Read : no"
    [ -d $f ] && D="Directory : yes" || D="Directory : no"
    echo "$W"
    echo "$R"
    echo "$X"
    echo "$D"
done