package Social_Media_Task;

import java.util.ArrayList;

public class UsingSocialMedia {
    public static void main(String[] args) {
        ArrayList<SocialMedia> socialMediaAccounts = new ArrayList<>();
        socialMediaAccounts.add(new Facebook("JamesB", "secretpassword", "James Bond", 40, 4500));
        socialMediaAccounts.add(new Instagram("Alex", "passwordone"));
        socialMediaAccounts.add(new Facebook("JaneB", "secretpasswordtwo", "Jane Bond", 25, 5000));
        socialMediaAccounts.add(new Instagram("Henry", "passwordfour"));
        socialMediaAccounts.add(new Instagram("Kate", "onemorepassword"));
        socialMediaAccounts.add(new Facebook("QueenElizabeth", "secretpasswordthree", "Elizabeth Alexandra Mary", 96, 3000));

        Instagram account1 = new Instagram("Lilibet", "passwordfour");
        account1.fullName = "Elizabeth Alexandra Mary";
        socialMediaAccounts.add(account1);

       for(SocialMedia each: socialMediaAccounts){
           if(each instanceof Facebook){
               if (((Facebook) each).getNumOfFriends() < 5000){
                   System.out.println(each);
               }
           }
       }
        for(SocialMedia each: socialMediaAccounts) {
            if (each instanceof Instagram) {
                ((Instagram) each).likePicture();
            }
        }

        for (int i = 0; i < socialMediaAccounts.size(); i++) {
            SocialMedia currentAccount = socialMediaAccounts.get(i);
            if(currentAccount.fullName != null) {
                for (int j = i + 1; j < socialMediaAccounts.size(); j++) {
                    SocialMedia comparingAccount = socialMediaAccounts.get(j);
                    if (currentAccount.fullName.equalsIgnoreCase(comparingAccount.fullName)) {
                        System.out.println("************");
                        System.out.println(currentAccount.fullName + " has " + currentAccount.platform + " and " + comparingAccount.platform + " account");
                        System.out.println(currentAccount);
                    }
                }
            }
        }


    }
}
