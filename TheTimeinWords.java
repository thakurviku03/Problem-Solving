package Problem_Solving;

import java.util.Scanner;
////////// by C++
public class TheTimeinWords {
    public static void main(String[] args) {
//#include<bits/stdc++.h>
//                using namespace std;
//
//        int main(){
//            string h,m;
//            cin>>h;
//            cin>>m;
//            if (h=="1"){
//                if (m=="00"){cout<<"one o' clock";}
//                else if (m=="1"){cout<<"one minute past one";}
//                else if (m=="02"){cout<<"two minutes past one";}
//                else if (m=="03"){cout<<"three minutes past one";}
//                else if (m=="04"){cout<<"four minutes past one";}
//                else if (m=="05"){cout<<"five minutes past one";}
//                else if (m=="06"){cout<<"six minutes past one";}
//                else if (m=="07"){cout<<"seven minutes past one";}
//                else if (m=="08"){cout<<"eight minutes past one";}
//                else if (m=="09"){cout<<"nine minutes past one";}
//                else if (m=="10"){cout<<"ten minutes past one";}
//                else if (m=="11"){cout<<"eleven minutes past one";}
//                else if (m=="12"){cout<<"twelve minutes past one";}
//                else if (m=="13"){cout<<"thirteen minutes past one";}
//                else if (m=="14"){cout<<"fourteen minutes past one";}
//                else if (m=="15"){cout<<"quarter past one";}
//                else if (m=="16"){cout<<"sixteen minutes past one";}
//                else if (m=="17"){cout<<"seventeen minutes past one";}
//                else if (m=="18"){cout<<"eighteen minutes past one";}
//                else if (m=="19"){cout<<"nineteen minutes past one";}
//                else if (m=="20"){cout<<"twenty minutes past one";}
//                else if (m=="21"){cout<<"twenty one minutes past one";}
//                else if (m=="22"){cout<<"twenty two minutes past one";}
//                else if (m=="23"){cout<<"twenty three minutes past one";}
//                else if (m=="24"){cout<<"twenty four minutes past one";}
//                else if (m=="25"){cout<<"twenty five minutes past one";}
//                else if (m=="26"){cout<<"twenty six minutes past one";}
//                else if (m=="27"){cout<<"twenty seven minutes past one";}
//                else if (m=="28"){cout<<"twenty eight minutes past one";}
//                else if (m=="29"){cout<<"twenty nine minutes past one";}
//                else if (m=="30"){cout<<"half past one";}
//                else if (m=="31"){cout<<"twenty nine minutes to two";}
//                else if (m=="32"){cout<<"twenty eight minutes to two";}
//                else if (m=="33"){cout<<"twenty seven minutes to two";}
//                else if (m=="34"){cout<<"twenty six minutes to two";}
//                else if (m=="35"){cout<<"twenty five minutes to two";}
//                else if (m=="36"){cout<<"twenty four minutes to two";}
//                else if (m=="37"){cout<<"twenty three minutes to two";}
//                else if (m=="38"){cout<<"twenty two minutes to two";}
//                else if (m=="39"){cout<<"twenty onee minutes to two";}
//                else if (m=="40"){cout<<"forty minutes to two";}
//                else if (m=="41"){cout<<"nineteen minutes to two";}
//                else if (m=="42"){cout<<"eighteen minutes to two";}
//                else if (m=="43"){cout<<"seventeen minutes to two";}
//                else if (m=="44"){cout<<"sixteen minutes to two";}
//                else if (m=="45"){cout<<"quarter to two";}
//                else if (m=="46"){cout<<"fourteen minutes to two";}
//                else if (m=="47"){cout<<"thirteen minutes to two";}
//                else if (m=="48"){cout<<"twelve minutes to two";}
//                else if (m=="49"){cout<<"eleven minutes to two";}
//                else if (m=="50"){cout<<"ten minutes to two";}
//                else if (m=="51"){cout<<"nine minutes to two";}
//                else if (m=="52"){cout<<"eight minutes to two";}
//                else if (m=="53"){cout<<"seven minutes to two";}
//                else if (m=="54"){cout<<"six minutes to two";}
//                else if (m=="55"){cout<<"five minutes to two";}
//                else if (m=="56"){cout<<"four minutes to two";}
//                else if (m=="57"){cout<<"three minutes to two";}
//                else if (m=="58"){cout<<"two minutes to two";}
//                else if (m=="59"){cout<<"one minute to two";}
//            }
//            if (h=="2"){
//                if (m=="00"){cout<<"two o' clock";}
//                else if (m=="01"){cout<<"one minute past two";}
//                else if (m=="02"){cout<<"two minutes past two";}
//                else if (m=="03"){cout<<"three minutes past two";}
//                else if (m=="04"){cout<<"four minutes past two";}
//                else if (m=="05"){cout<<"five minutes past two";}
//                else if (m=="06"){cout<<"six minutes past two";}
//                else if (m=="07"){cout<<"seven minutes past two";}
//                else if (m=="08"){cout<<"eight minutes past two";}
//                else if (m=="09"){cout<<"nine minutes past two";}
//                else if (m=="10"){cout<<"ten minutes past two";}
//                else if (m=="11"){cout<<"eleven minutes past two";}
//                else if (m=="12"){cout<<"twelve minutes past two";}
//                else if (m=="13"){cout<<"thirteen minutes past two";}
//                else if (m=="14"){cout<<"fourteen minutes past two";}
//                else if (m=="15"){cout<<"quarter past two";}
//                else if (m=="16"){cout<<"sixteen minutes past two";}
//                else if (m=="17"){cout<<"seventeen minutes past two";}
//                else if (m=="18"){cout<<"eighteen minutes past two";}
//                else if (m=="19"){cout<<"nineteen minutes past two";}
//                else if (m=="20"){cout<<"twenty minutes past two";}
//                else if (m=="21"){cout<<"twenty one minutes past two";}
//                else if (m=="22"){cout<<"twenty two minutes past two";}
//                else if (m=="23"){cout<<"twenty three minutes past two";}
//                else if (m=="24"){cout<<"twenty four minutes past two";}
//                else if (m=="25"){cout<<"twenty five minutes past two";}
//                else if (m=="26"){cout<<"twenty six minutes past two";}
//                else if (m=="27"){cout<<"twenty seven minutes past two";}
//                else if (m=="28"){cout<<"twenty eight minutes past two";}
//                else if (m=="29"){cout<<"twenty nine minutes past two";}
//                else if (m=="30"){cout<<"half past two";}
//                else if (m=="31"){cout<<"twenty nine minutes to three";}
//                else if (m=="32"){cout<<"twenty eight minutes to three";}
//                else if (m=="33"){cout<<"twenty seven minutes to three";}
//                else if (m=="34"){cout<<"twenty six minutes to three";}
//                else if (m=="35"){cout<<"twenty five minutes to three";}
//                else if (m=="36"){cout<<"twenty four minutes to three";}
//                else if (m=="37"){cout<<"twenty three minutes to three";}
//                else if (m=="38"){cout<<"twenty two minutes to three";}
//                else if (m=="39"){cout<<"twenty onee minutes to three";}
//                else if (m=="40"){cout<<"forty minutes to three";}
//                else if (m=="41"){cout<<"nineteen minutes to three";}
//                else if (m=="42"){cout<<"eighteen minutes to three";}
//                else if (m=="43"){cout<<"seventeen minutes to three";}
//                else if (m=="44"){cout<<"sixteen minutes to three";}
//                else if (m=="45"){cout<<"quarter to three";}
//                else if (m=="46"){cout<<"fourteen minutes to three";}
//                else if (m=="47"){cout<<"thirteen minutes to three";}
//                else if (m=="48"){cout<<"twelve minutes to three";}
//                else if (m=="49"){cout<<"eleven minutes to three";}
//                else if (m=="50"){cout<<"ten minutes to three";}
//                else if (m=="51"){cout<<"nine minutes to three";}
//                else if (m=="52"){cout<<"eight minutes to three";}
//                else if (m=="53"){cout<<"seven minutes to three";}
//                else if (m=="54"){cout<<"six minutes to three";}
//                else if (m=="55"){cout<<"five minutes to three";}
//                else if (m=="56"){cout<<"four minutes to three";}
//                else if (m=="57"){cout<<"three minutes to three";}
//                else if (m=="58"){cout<<"two minutes to three";}
//                else if (m=="59"){cout<<"one minute to three";}
//            }
//            if (h=="3"){
//                if (m=="00"){cout<<"three o' clock";}
//                else if (m=="01"){cout<<"one minute past three";}
//                else if (m=="02"){cout<<"two minutes past three";}
//                else if (m=="03"){cout<<"three minutes past three";}
//                else if (m=="04"){cout<<"four minutes past three";}
//                else if (m=="05"){cout<<"five minutes past three";}
//                else if (m=="06"){cout<<"six minutes past three";}
//                else if (m=="07"){cout<<"seven minutes past three";}
//                else if (m=="08"){cout<<"eight minutes past three";}
//                else if (m=="09"){cout<<"nine minutes past three";}
//                else if (m=="10"){cout<<"ten minutes past three";}
//                else if (m=="11"){cout<<"eleven minutes past three";}
//                else if (m=="12"){cout<<"twelve minutes past three";}
//                else if (m=="13"){cout<<"thirteen minutes past three";}
//                else if (m=="14"){cout<<"fourteen minutes past three";}
//                else if (m=="15"){cout<<"quarter past three";}
//                else if (m=="16"){cout<<"sixteen minutes past three";}
//                else if (m=="17"){cout<<"seventeen minutes past three";}
//                else if (m=="18"){cout<<"eighteen minutes past three";}
//                else if (m=="19"){cout<<"nineteen minutes past three";}
//                else if (m=="20"){cout<<"twenty minutes past three";}
//                else if (m=="21"){cout<<"twenty one minutes past three";}
//                else if (m=="22"){cout<<"twenty two minutes past three";}
//                else if (m=="23"){cout<<"twenty three minutes past three";}
//                else if (m=="24"){cout<<"twenty four minutes past three";}
//                else if (m=="25"){cout<<"twenty five minutes past three";}
//                else if (m=="26"){cout<<"twenty six minutes past three";}
//                else if (m=="27"){cout<<"twenty seven minutes past three";}
//                else if (m=="28"){cout<<"twenty eight minutes past three";}
//                else if (m=="29"){cout<<"twenty nine minutes past three";}
//                else if (m=="30"){cout<<"half past three";}
//                else if (m=="31"){cout<<"twenty nine minutes to four";}
//                else if (m=="32"){cout<<"twenty eight minutes to four";}
//                else if (m=="33"){cout<<"twenty seven minutes to four";}
//                else if (m=="34"){cout<<"twenty six minutes to four";}
//                else if (m=="35"){cout<<"twenty five minutes to four";}
//                else if (m=="36"){cout<<"twenty four minutes to four";}
//                else if (m=="37"){cout<<"twenty three minutes to four";}
//                else if (m=="38"){cout<<"twenty two minutes to four";}
//                else if (m=="39"){cout<<"twenty onee minutes to four";}
//                else if (m=="40"){cout<<"forty minutes to four";}
//                else if (m=="41"){cout<<"nineteen minutes to four";}
//                else if (m=="42"){cout<<"eighteen minutes to four";}
//                else if (m=="43"){cout<<"seventeen minutes to four";}
//                else if (m=="44"){cout<<"sixteen minutes to four";}
//                else if (m=="45"){cout<<"quarter to four";}
//                else if (m=="46"){cout<<"fourteen minutes to four";}
//                else if (m=="47"){cout<<"thirteen minutes to four";}
//                else if (m=="48"){cout<<"twelve minutes to four";}
//                else if (m=="49"){cout<<"eleven minutes to four";}
//                else if (m=="50"){cout<<"ten minutes to four";}
//                else if (m=="51"){cout<<"nine minutes to four";}
//                else if (m=="52"){cout<<"eight minutes to four";}
//                else if (m=="53"){cout<<"seven minutes to four";}
//                else if (m=="54"){cout<<"six minutes to four";}
//                else if (m=="55"){cout<<"five minutes to four";}
//                else if (m=="56"){cout<<"four minutes to four";}
//                else if (m=="57"){cout<<"three minutes to four";}
//                else if (m=="58"){cout<<"two minutes to four";}
//                else if (m=="59"){cout<<"one minute to four";}
//            }
//            if (h=="4"){
//                if (m=="00"){cout<<"four o' clock";}
//                else if (m=="01"){cout<<"one minute past four";}
//                else if (m=="02"){cout<<"two minutes past four";}
//                else if (m=="03"){cout<<"three minutes past four";}
//                else if (m=="04"){cout<<"four minutes past four";}
//                else if (m=="05"){cout<<"five minutes past four";}
//                else if (m=="06"){cout<<"six minutes past four";}
//                else if (m=="07"){cout<<"seven minutes past four";}
//                else if (m=="08"){cout<<"eight minutes past four";}
//                else if (m=="09"){cout<<"nine minutes past four";}
//                else if (m=="10"){cout<<"ten minutes past four";}
//                else if (m=="11"){cout<<"eleven minutes past four";}
//                else if (m=="12"){cout<<"twelve minutes past four";}
//                else if (m=="13"){cout<<"thirteen minutes past four";}
//                else if (m=="14"){cout<<"fourteen minutes past four";}
//                else if (m=="15"){cout<<"quarter past four";}
//                else if (m=="16"){cout<<"sixteen minutes past four";}
//                else if (m=="17"){cout<<"seventeen minutes past four";}
//                else if (m=="18"){cout<<"eighteen minutes past four";}
//                else if (m=="19"){cout<<"nineteen minutes past four";}
//                else if (m=="20"){cout<<"twenty minutes past four";}
//                else if (m=="21"){cout<<"twenty one minutes past three";}
//                else if (m=="22"){cout<<"twenty two minutes past four";}
//                else if (m=="23"){cout<<"twenty three minutes past four";}
//                else if (m=="24"){cout<<"twenty four minutes past four";}
//                else if (m=="25"){cout<<"twenty five minutes past four";}
//                else if (m=="26"){cout<<"twenty six minutes past four";}
//                else if (m=="27"){cout<<"twenty seven minutes past four";}
//                else if (m=="28"){cout<<"twenty eight minutes past four";}
//                else if (m=="29"){cout<<"twenty nine minutes past four";}
//                else if (m=="30"){cout<<"half past four";}
//                else if (m=="31"){cout<<"twenty nine minutes to five";}
//                else if (m=="32"){cout<<"twenty eight minutes to five";}
//                else if (m=="33"){cout<<"twenty seven minutes to five";}
//                else if (m=="34"){cout<<"twenty six minutes to five";}
//                else if (m=="35"){cout<<"twenty five minutes to five";}
//                else if (m=="36"){cout<<"twenty four minutes to five";}
//                else if (m=="37"){cout<<"twenty three minutes to five";}
//                else if (m=="38"){cout<<"twenty two minutes to five";}
//                else if (m=="39"){cout<<"twenty one minutes to five";}
//                else if (m=="40"){cout<<"forty minutes to five";}
//                else if (m=="41"){cout<<"nineteen minutes to five";}
//                else if (m=="42"){cout<<"eighteen minutes to five";}
//                else if (m=="43"){cout<<"seventeen minutes to five";}
//                else if (m=="44"){cout<<"sixteen minutes to five";}
//                else if (m=="45"){cout<<"quarter to five";}
//                else if (m=="46"){cout<<"fourteen minutes to five";}
//                else if (m=="47"){cout<<"thirteen minutes to five";}
//                else if (m=="48"){cout<<"twelve minutes to five";}
//                else if (m=="49"){cout<<"eleven minutes to five";}
//                else if (m=="50"){cout<<"ten minutes to five";}
//                else if (m=="51"){cout<<"nine minutes to five";}
//                else if (m=="52"){cout<<"eight minutes to five";}
//                else if (m=="53"){cout<<"seven minutes to five";}
//                else if (m=="54"){cout<<"six minutes to five";}
//                else if (m=="55"){cout<<"five minutes to five";}
//                else if (m=="56"){cout<<"four minutes to five";}
//                else if (m=="57"){cout<<"three minutes to five";}
//                else if (m=="58"){cout<<"two minutes to five";}
//                else if (m=="59"){cout<<"one minute to five";}
//            }
//            if (h=="5"){
//                if (m=="00"){cout<<"five o' clock";}
//                else if (m=="01"){cout<<"one minute past five";}
//                else if (m=="02"){cout<<"two minutes past five";}
//                else if (m=="03"){cout<<"three minutes past five";}
//                else if (m=="04"){cout<<"four minutes past five";}
//                else if (m=="05"){cout<<"five minutes past five";}
//                else if (m=="06"){cout<<"six minutes past five";}
//                else if (m=="07"){cout<<"seven minutes past five";}
//                else if (m=="08"){cout<<"eight minutes past five";}
//                else if (m=="09"){cout<<"nine minutes past five";}
//                else if (m=="10"){cout<<"ten minutes past five";}
//                else if (m=="11"){cout<<"eleven minutes past five";}
//                else if (m=="12"){cout<<"twelve minutes past five";}
//                else if (m=="13"){cout<<"thirteen minutes past five";}
//                else if (m=="14"){cout<<"fourteen minutes past five";}
//                else if (m=="15"){cout<<"quarter past five";}
//                else if (m=="16"){cout<<"sixteen minutes past five";}
//                else if (m=="17"){cout<<"seventeen minutes past five";}
//                else if (m=="18"){cout<<"eighteen minutes past five";}
//                else if (m=="19"){cout<<"nineteen minutes past five";}
//                else if (m=="20"){cout<<"twenty minutes past five";}
//                else if (m=="21"){cout<<"twenty one minutes past three";}
//                else if (m=="22"){cout<<"twenty two minutes past five";}
//                else if (m=="23"){cout<<"twenty three minutes past five";}
//                else if (m=="24"){cout<<"twenty four minutes past five";}
//                else if (m=="25"){cout<<"twenty five minutes past five";}
//                else if (m=="26"){cout<<"twenty six minutes past five";}
//                else if (m=="27"){cout<<"twenty seven minutes past five";}
//                else if (m=="28"){cout<<"twenty eight minutes past five";}
//                else if (m=="29"){cout<<"twenty nine minutes past five";}
//                else if (m=="30"){cout<<"half past five";}
//                else if (m=="31"){cout<<"twenty nine minutes to six";}
//                else if (m=="32"){cout<<"twenty eight minutes to six";}
//                else if (m=="33"){cout<<"twenty seven minutes to six";}
//                else if (m=="34"){cout<<"twenty six minutes to six";}
//                else if (m=="35"){cout<<"twenty five minutes to six";}
//                else if (m=="36"){cout<<"twenty four minutes to six";}
//                else if (m=="37"){cout<<"twenty three minutes to six";}
//                else if (m=="38"){cout<<"twenty two minutes to six";}
//                else if (m=="39"){cout<<"twenty one minutes to six";}
//                else if (m=="40"){cout<<"forty minutes to six";}
//                else if (m=="41"){cout<<"nineteen minutes to six";}
//                else if (m=="42"){cout<<"eighteen minutes to six";}
//                else if (m=="43"){cout<<"seventeen minutes to six";}
//                else if (m=="44"){cout<<"sixteen minutes to six";}
//                else if (m=="45"){cout<<"quarter to six";}
//                else if (m=="46"){cout<<"fourteen minutes to six";}
//                else if (m=="47"){cout<<"thirteen minutes to six";}
//                else if (m=="48"){cout<<"twelve minutes to six";}
//                else if (m=="49"){cout<<"eleven minutes to six";}
//                else if (m=="50"){cout<<"ten minutes to six";}
//                else if (m=="51"){cout<<"nine minutes to six";}
//                else if (m=="52"){cout<<"eight minutes to six";}
//                else if (m=="53"){cout<<"seven minutes to six";}
//                else if (m=="54"){cout<<"six minutes to six";}
//                else if (m=="55"){cout<<"five minutes to six";}
//                else if (m=="56"){cout<<"four minutes to six";}
//                else if (m=="57"){cout<<"three minutes to six";}
//                else if (m=="58"){cout<<"two minutes to six";}
//                else if (m=="59"){cout<<"one minute to six";}
//            }
//            if (h=="6"){
//                if (m=="00"){cout<<"six o' clock";}
//                else if (m=="01"){cout<<"one minute past six";}
//                else if (m=="02"){cout<<"two minutes past six";}
//                else if (m=="03"){cout<<"three minutes past six";}
//                else if (m=="04"){cout<<"four minutes past six";}
//                else if (m=="05"){cout<<"five minutes past six";}
//                else if (m=="06"){cout<<"six minutes past six";}
//                else if (m=="07"){cout<<"seven minutes past six";}
//                else if (m=="08"){cout<<"eight minutes past six";}
//                else if (m=="09"){cout<<"nine minutes past six";}
//                else if (m=="10"){cout<<"ten minutes past six";}
//                else if (m=="11"){cout<<"eleven minutes past six";}
//                else if (m=="12"){cout<<"twelve minutes past six";}
//                else if (m=="13"){cout<<"thirteen minutes past six";}
//                else if (m=="14"){cout<<"fourteen minutes past six";}
//                else if (m=="15"){cout<<"quarter past six";}
//                else if (m=="16"){cout<<"sixteen minutes past six";}
//                else if (m=="17"){cout<<"seventeen minutes past six";}
//                else if (m=="18"){cout<<"eighteen minutes past six";}
//                else if (m=="19"){cout<<"nineteen minutes past six";}
//                else if (m=="20"){cout<<"twenty minutes past six";}
//                else if (m=="21"){cout<<"twenty one minutes past three";}
//                else if (m=="22"){cout<<"twenty two minutes past six";}
//                else if (m=="23"){cout<<"twenty three minutes past six";}
//                else if (m=="24"){cout<<"twenty four minutes past six";}
//                else if (m=="25"){cout<<"twenty five minutes past six";}
//                else if (m=="26"){cout<<"twenty six minutes past six";}
//                else if (m=="27"){cout<<"twenty seven minutes past six";}
//                else if (m=="28"){cout<<"twenty eight minutes past six";}
//                else if (m=="29"){cout<<"twenty nine minutes past six";}
//                else if (m=="30"){cout<<"half past six";}
//                else if (m=="31"){cout<<"twenty nine minutes to seven";}
//                else if (m=="32"){cout<<"twenty eight minutes to seven";}
//                else if (m=="33"){cout<<"twenty seven minutes to seven";}
//                else if (m=="34"){cout<<"twenty six minutes to seven";}
//                else if (m=="35"){cout<<"twenty five minutes to seven";}
//                else if (m=="36"){cout<<"twenty four minutes to seven";}
//                else if (m=="37"){cout<<"twenty three minutes to seven";}
//                else if (m=="38"){cout<<"twenty two minutes to seven";}
//                else if (m=="39"){cout<<"twenty one minutes to seven";}
//                else if (m=="40"){cout<<"forty minutes to seven";}
//                else if (m=="41"){cout<<"nineteen minutes to seven";}
//                else if (m=="42"){cout<<"eighteen minutes to seven";}
//                else if (m=="43"){cout<<"seventeen minutes to seven";}
//                else if (m=="44"){cout<<"sixteen minutes to seven";}
//                else if (m=="45"){cout<<"quarter to seven";}
//                else if (m=="46"){cout<<"fourteen minutes to seven";}
//                else if (m=="47"){cout<<"thirteen minutes to seven";}
//                else if (m=="48"){cout<<"twelve minutes to seven";}
//                else if (m=="49"){cout<<"eleven minutes to seven";}
//                else if (m=="50"){cout<<"ten minutes to seven";}
//                else if (m=="51"){cout<<"nine minutes to seven";}
//                else if (m=="52"){cout<<"eight minutes to seven";}
//                else if (m=="53"){cout<<"seven minutes to seven";}
//                else if (m=="54"){cout<<"six minutes to seven";}
//                else if (m=="55"){cout<<"five minutes to seven";}
//                else if (m=="56"){cout<<"four minutes to seven";}
//                else if (m=="57"){cout<<"three minutes to seven";}
//                else if (m=="58"){cout<<"two minutes to seven";}
//                else if (m=="59"){cout<<"one minute to seven";}
//            }
//            if (h=="7"){
//                if (m=="00"){cout<<"seven o' clock";}
//                else if (m=="01"){cout<<"one minute past seven";}
//                else if (m=="02"){cout<<"two minutes past seven";}
//                else if (m=="03"){cout<<"three minutes past seven";}
//                else if (m=="04"){cout<<"four minutes past seven";}
//                else if (m=="05"){cout<<"five minutes past seven";}
//                else if (m=="06"){cout<<"six minutes past seven";}
//                else if (m=="07"){cout<<"seven minutes past seven";}
//                else if (m=="08"){cout<<"eight minutes past seven";}
//                else if (m=="09"){cout<<"nine minutes past seven";}
//                else if (m=="10"){cout<<"ten minutes past seven";}
//                else if (m=="11"){cout<<"eleven minutes past seven";}
//                else if (m=="12"){cout<<"twelve minutes past seven";}
//                else if (m=="13"){cout<<"thirteen minutes past seven";}
//                else if (m=="14"){cout<<"fourteen minutes past seven";}
//                else if (m=="15"){cout<<"quarter past seven";}
//                else if (m=="16"){cout<<"sixteen minutes past seven";}
//                else if (m=="17"){cout<<"seventeen minutes past seven";}
//                else if (m=="18"){cout<<"eighteen minutes past seven";}
//                else if (m=="19"){cout<<"nineteen minutes past seven";}
//                else if (m=="20"){cout<<"twenty minutes past seven";}
//                else if (m=="21"){cout<<"twenty one minutes past three";}
//                else if (m=="22"){cout<<"twenty two minutes past seven";}
//                else if (m=="23"){cout<<"twenty three minutes past seven";}
//                else if (m=="24"){cout<<"twenty four minutes past seven";}
//                else if (m=="25"){cout<<"twenty five minutes past seven";}
//                else if (m=="26"){cout<<"twenty six minutes past seven";}
//                else if (m=="27"){cout<<"twenty seven minutes past seven";}
//                else if (m=="28"){cout<<"twenty eight minutes past seven";}
//                else if (m=="29"){cout<<"twenty nine minutes past seven";}
//                else if (m=="30"){cout<<"half past seven";}
//                else if (m=="31"){cout<<"twenty nine minutes to eight";}
//                else if (m=="32"){cout<<"twenty eight minutes to eight";}
//                else if (m=="33"){cout<<"twenty seven minutes to eight";}
//                else if (m=="34"){cout<<"twenty six minutes to eight";}
//                else if (m=="35"){cout<<"twenty five minutes to eight";}
//                else if (m=="36"){cout<<"twenty four minutes to eight";}
//                else if (m=="37"){cout<<"twenty three minutes to eight";}
//                else if (m=="38"){cout<<"twenty two minutes to eight";}
//                else if (m=="39"){cout<<"twenty one minutes to eight";}
//                else if (m=="40"){cout<<"forty minutes to eight";}
//                else if (m=="41"){cout<<"nineteen minutes to eight";}
//                else if (m=="42"){cout<<"eighteen minutes to eight";}
//                else if (m=="43"){cout<<"seventeen minutes to eight";}
//                else if (m=="44"){cout<<"sixteen minutes to eight";}
//                else if (m=="45"){cout<<"quarter to eight";}
//                else if (m=="46"){cout<<"fourteen minutes to eight";}
//                else if (m=="47"){cout<<"thirteen minutes to eight";}
//                else if (m=="48"){cout<<"twelve minutes to eight";}
//                else if (m=="49"){cout<<"eleven minutes to eight";}
//                else if (m=="50"){cout<<"ten minutes to eight";}
//                else if (m=="51"){cout<<"nine minutes to eight";}
//                else if (m=="52"){cout<<"eight minutes to eight";}
//                else if (m=="53"){cout<<"seven minutes to eight";}
//                else if (m=="54"){cout<<"six minutes to eight";}
//                else if (m=="55"){cout<<"five minutes to eight";}
//                else if (m=="56"){cout<<"four minutes to eight";}
//                else if (m=="57"){cout<<"three minutes to eight";}
//                else if (m=="58"){cout<<"two minutes to eight";}
//                else if (m=="59"){cout<<"one minute to eight";}
//            }
//            if (h=="10"){
//                if (m=="00"){cout<<"ten o' clock";}
//                else if (m=="01"){cout<<"one minute past ten";}
//                else if (m=="02"){cout<<"two minutes past ten";}
//                else if (m=="03"){cout<<"three minutes past ten";}
//                else if (m=="04"){cout<<"four minutes past ten";}
//                else if (m=="05"){cout<<"five minutes past ten";}
//                else if (m=="06"){cout<<"six minutes past ten";}
//                else if (m=="07"){cout<<"seven minutes past ten";}
//                else if (m=="08"){cout<<"eight minutes past ten";}
//                else if (m=="09"){cout<<"nine minutes past ten";}
//                else if (m=="10"){cout<<"ten minutes past ten";}
//                else if (m=="11"){cout<<"eleven minutes past ten";}
//                else if (m=="12"){cout<<"twelve minutes past ten";}
//                else if (m=="13"){cout<<"thirteen minutes past ten";}
//                else if (m=="14"){cout<<"fourteen minutes past ten";}
//                else if (m=="15"){cout<<"quarter past ten";}
//                else if (m=="16"){cout<<"sixteen minutes past ten";}
//                else if (m=="17"){cout<<"seventeen minutes past ten";}
//                else if (m=="18"){cout<<"eighteen minutes past ten";}
//                else if (m=="19"){cout<<"nineteen minutes past ten";}
//                else if (m=="20"){cout<<"twenty minutes past ten";}
//                else if (m=="21"){cout<<"twenty one minutes past three";}
//                else if (m=="22"){cout<<"twenty two minutes past ten";}
//                else if (m=="23"){cout<<"twenty three minutes past ten";}
//                else if (m=="24"){cout<<"twenty four minutes past ten";}
//                else if (m=="25"){cout<<"twenty five minutes past ten";}
//                else if (m=="26"){cout<<"twenty six minutes past ten";}
//                else if (m=="27"){cout<<"twenty ten minutes past ten";}
//                else if (m=="28"){cout<<"twenty eight minutes past ten";}
//                else if (m=="29"){cout<<"twenty nine minutes past ten";}
//                else if (m=="30"){cout<<"half past ten";}
//                else if (m=="31"){cout<<"twenty nine minutes to eleven";}
//                else if (m=="32"){cout<<"twenty eight minutes to eleven";}
//                else if (m=="33"){cout<<"twenty seven minutes to eleven";}
//                else if (m=="34"){cout<<"twenty six minutes to eleven";}
//                else if (m=="35"){cout<<"twenty five minutes to eleven";}
//                else if (m=="36"){cout<<"twenty four minutes to eleven";}
//                else if (m=="37"){cout<<"twenty three minutes to eleven";}
//                else if (m=="38"){cout<<"twenty two minutes to eleven";}
//                else if (m=="39"){cout<<"twenty one minutes to eleven";}
//                else if (m=="40"){cout<<"forty minutes to eleven";}
//                else if (m=="41"){cout<<"nineteen minutes to eleven";}
//                else if (m=="42"){cout<<"eighteen minutes to eleven";}
//                else if (m=="43"){cout<<"seventeen minutes to eleven";}
//                else if (m=="44"){cout<<"sixteen minutes to eleven";}
//                else if (m=="45"){cout<<"quarter to eleven";}
//                else if (m=="46"){cout<<"fourteen minutes to eleven";}
//                else if (m=="47"){cout<<"thirteen minutes to eleven";}
//                else if (m=="48"){cout<<"twelve minutes to eleven";}
//                else if (m=="49"){cout<<"eleven minutes to eleven";}
//                else if (m=="50"){cout<<"ten minutes to eleven";}
//                else if (m=="51"){cout<<"nine minutes to eleven";}
//                else if (m=="52"){cout<<"eight minutes to eleven";}
//                else if (m=="53"){cout<<"seven minutes to eleven";}
//                else if (m=="54"){cout<<"six minutes to eleven";}
//                else if (m=="55"){cout<<"five minutes to eleven";}
//                else if (m=="56"){cout<<"four minutes to eleven";}
//                else if (m=="57"){cout<<"three minutes to eleven";}
//                else if (m=="58"){cout<<"two minutes to eleven";}
//                else if (m=="59"){cout<<"one minute to eleven";}
//            }
//            return 0;
//        }


    }
}
