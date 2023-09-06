package backEnd.helloThymeleaf.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backEnd.helloThymeleaf.domain.Friend;

@Controller
public class FriendController {
	
	private ArrayList<Friend> friends = new ArrayList<>();
	
	@GetMapping("/index")
	public String showFriends(Model model) {
				
		model.addAttribute("friends", friends);
		return("index");
	}
	
	@PostMapping("/addFriend")
	public String addFriends(@RequestParam (name="name") String name) {
		friends.add(new Friend(name));
				
		return("redirect:index");
	}

}
