select resortID, resortName,
        case
               when (starRating <= 5.0 and starRating >=4.5)
                   then 'Excellent Resort'
               when (starRating <=4.4 and starRating >= 4.0)
                   then 'Very Good Resort'
               else 'Good Resort'
           end Comments
       from Resort;