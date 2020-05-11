package dctech.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatalogEndpoint {

    @RequestMapping("/uptime")
    public @ResponseBody  Double upTime() {
        return null;
    }

}
