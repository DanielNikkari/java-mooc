import java.util.HashMap;

public class IOU {

  private HashMap<String, Double> debts;

  public static void main(String[] args) {
    IOU mattsIOU = new IOU();
    mattsIOU.setSum("Arthur", 51.5);
    mattsIOU.setSum("Michael", 30);

    System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
  }

  public IOU() {
    this.debts = new HashMap<>();
  }

  public void setSum(String toWhom, double amount) {
    this.debts.put(toWhom, amount);
  }

  public double howMuchDoIOweTo(String toWhom) {
    if (!this.debts.containsKey(toWhom)) {
      return 0;
    }

    return this.debts.get(toWhom);
  }
  
}
