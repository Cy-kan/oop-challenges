@@ -1,3 +1,7 @@
package Challenge6;

import javax.sql.DataSource;

public abstract class Account {

    protected int id;
@@ -6,6 +10,6 @@ public abstract class Account {

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();
      //  myData.execute();
    }
}
