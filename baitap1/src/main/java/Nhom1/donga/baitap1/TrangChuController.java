package Nhom1.donga.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuController {

    @GetMapping("/trangchu")
    public String trangChu() {
        return "trangchu";
    }
}
