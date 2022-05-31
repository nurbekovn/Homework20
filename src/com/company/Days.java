package com.company;
//      Кундорго enum тузунуз (Monday, Tuesday ...)
//      консолдон бир кунду белгилениз .
//      Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же
//      Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп
//      кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
//      Жуманын кундорун кыргыз тилинде корсотунуз.

public  enum Days {

    DUISHOMBU("Java lesson "),
    SHEISHEMBI("Practice lesson "),
    SHARSHEMBI("Java lesson"),
    BEISHEMBI("Practice lesson"),
    JUMA("Java lesson "),
    ISHEMBI("No lesson "),
    JEKSHEMBI("No lesson ");

    String days;

    Days(String days) {
        this.days = days;
    }

    public String daymethod() {
        return days;
    }
}
