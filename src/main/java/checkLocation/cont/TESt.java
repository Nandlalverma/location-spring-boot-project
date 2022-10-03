package checkLocation.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TESt {

	@RequestMapping("/testt")
	public String Test() {
		return "showLocation";
	}
}
