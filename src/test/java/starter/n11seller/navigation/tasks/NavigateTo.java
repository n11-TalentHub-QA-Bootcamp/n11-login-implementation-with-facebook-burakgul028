package starter.n11seller.navigation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11seller.navigation.user_interface.n11SellerOfficeHomePage;

public class NavigateTo {
        public static Performable theN11SellerOfficeHomePage() {
            return Task.where("{0} opens the n11 Seller Office home page",
                    Open.browserOn().the(n11SellerOfficeHomePage.class));
        }
    }

