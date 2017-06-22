# JavaLearning

## hotel-reservation

### hotel details

|      name     |  rating  |  weekday-regular  |  weekday-rewards  |  weekend-regular  |  weekend-rewards  |
|:-------------:|:--------:|:-----------------:|:-----------------:|:-----------------:|:-----------------:|
|   Lakewood    |     3    |        110        |         80        |         90        |         80        |
|   Bridgewood  |     4    |        160        |        110        |         60        |         50        |
|   Ridgewood   |     5    |        220        |        100        |        150        |         40        |


### IO
- **Input**: a range of dates for a regular or rewards customer
- **Output**: the cheapest available hotel. In case of a tie, the hotel with highest rating should be returned.

#### Example:

**INPUT FORMAT**:  
<customer_type>: \<date1>, \<date2>, \<date3>, ...  

**OUTPUT FORMAT**:  
<name_of_the_cheapest_hotel>


**INPUT 1:**  
Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)  
**OUTPUT 1:**  
Lakewood

**INPUT 2:**  
Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)  
**OUTPUT 2:**  
Bridgewood

**INPUT 3:**  
Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)   
**OUTPUT 3:**  
Ridgewood
