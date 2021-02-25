package com.example.midtermRandomJoke_ThiHongGamTran_300284929.controller;

import com.example.midtermRandomJoke_ThiHongGamTran_300284929.service.JokeService;
import com.example.midtermRandomJoke_ThiHongGamTran_300284929.service.JokeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeServiceImp jokeService) {
        this.jokeService = jokeService;
    }


   @RequestMapping({"/", ""})
   public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
   }

//    @RequestMapping("/")
//   public String myController(@ModelAttribute("joke") Model model) {
//        model.addAttribute("joke", jokeService.getJoke());
//       return "index";
//    }
}
