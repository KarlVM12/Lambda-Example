public class Lambda
{
  // this class shows an example of a lambda function in use
  public static void main(String[] beans)
  {
    // an "anonymous" method is created named "triple" that is defined and can be passed through as a paramter
    int[] array = {7,8};
    Function triple = (num) -> { for (int i = 0; i < array.length; i++)
                              {
                                num[i] = num[i] * 3;
                              }

                              return num;
                            }; // triple is a method that takes all the values in an array and triples them, returning the new array

    // the int array answer uses the triple method to triple all the values in the array, array
    // the method map recieves the array and the desired method to be applied to that array
    int[] answer = map(array, triple);
    System.out.println(answer[0] + " " + answer[1]);
  }

  // interface used to set the return value and parameter of lambda methods
  interface Function
  {
    int[] operation(int[] a);
  }

  // map function takes the parameter of the lambda method as well as its name and applies that method to the paramter
  public static int[] map(int[] n, Function fx)
  {
    return fx.operation(n);
  }

}
