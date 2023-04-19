package ExceptionHandle;

import javax.imageio.IIOException;

public class Class1 {
    int even;
    int odd;

    public Class1(int even, int odd) {
        this.even = even;
        this.odd = odd;
    }
    public void number(int i) throws IIOException {
      if ( i==even)
          System.out.println("even number");
      else
          System.out.println("odd number");

    }
}
