package Lab6;

import java.util.ArrayList;

public class Person {
    public class Date{};
    public class FullName{};
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName name;
    private Date birthDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;
    private ArrayList<Hospital> hospitals;

    public class Address{}
    public class Phone{}
    enum Gender {
        Male,
        Female,
        Male_to_Female,
        Female_to_Male,
        Binary,
        Non_Binary,
        Genderfluid,
        Agender,
        Bigender,
        Polygender,
        Neutrois,
        Gender_Apathetic,
        Androgyne,
        Intergender,
        Demigender,
        Greygender,
        Aporagender,
        Maverique,
        Novigender,
        Designated_gender,
        AFAB,
        AMAB,
        Transitioning,
        Intersex,
        Dyadic,
        Trans_Woman,
        Trans_Man,
        Trans_Feminine,
        Trans_Masculine,
        Other
    }
}
