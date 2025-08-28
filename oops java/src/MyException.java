public class MyException {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try {
            udf.validate(12);
            udf.validate(19);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}