package firstQuestion.manager;

import firstQuestion.address.Address;
import firstQuestion.user.User;

import java.util.ArrayList;
import java.util.List;

public class AddressManager {

    public static void addAddress(User user, Address address) {


       if (user.getAddressList() == null){

            List<Address> addressList = new ArrayList<Address>();

            addressList.add(address);

            user.setAddressList(addressList);

            System.out.println("Given address has succefully added to your user details");
        } else {

           user.getAddressList().add(address);
        }
    }


    public static void deleteAddress(User user, Address address) {

        if (user.getAddressList() != null) {

            user.getAddressList().remove(address);
        } else {

            System.out.println("Three is no any address data to delete ");
        }

    }

}
