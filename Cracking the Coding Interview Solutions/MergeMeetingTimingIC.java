//Your company built an in-house calendar tool called HiCal.
//You want to add a feature to see the times in a day when everyone is available.
//O(n2)

package com.Practice;

import java.util.ArrayList;


public class MergeMeetingTimingIC {

    public static void main(String[] args) {
        Meeting meeting1 = new Meeting(1,2);
        Meeting meeting2 = new Meeting(3,4);
        Meeting meeting3 = new Meeting(3,4);
        Meeting meeting4 = new Meeting(5,8);
        Meeting meeting5 = new Meeting(6,7);
        Meeting meeting6 = new Meeting(6,9);
        Meeting meeting7 = new Meeting(10,11);

        Meeting[] meetings = new Meeting[7];
        meetings[0]= meeting1;
        meetings[1]= meeting2;
        meetings[2]= meeting3;
        meetings[3]= meeting4;
        meetings[4]= meeting5;
        meetings[5]= meeting6;
        meetings[6]= meeting7;

        MergeMeetingTimes(meetings);

    }

    //O(n^2)
    private static void MergeMeetingTimes(Meeting[] meetings) {
        ArrayList<Meeting> result = new ArrayList<>();
        for(int i = 0; i < meetings.length ; i++) {
            int currentStartTime = meetings[i].startTime;
            int currentEndTime = meetings[i].endTime;
            for(int j = i+1; j < meetings.length; j++) {
                if(currentEndTime >= meetings[j].startTime) {
                    i++;
                    if(currentEndTime <= meetings[j].endTime) {
                        currentEndTime = meetings[j].endTime;

                    }
                }
            }
            Meeting tempMeeting = new Meeting(currentStartTime, currentEndTime);
            result.add(tempMeeting);

        }
        System.out.println(result.toString());
    }
}
    
    class Meeting {
        int startTime;
        int endTime;

        Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime   = endTime;

        }

        public String toString() {
            return String.format("(%d, %d)", startTime, endTime);
        }

    }
