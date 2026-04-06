package com.example.lis_analyzer;
import com.example.lis_analyzer.LISUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class LISController {

    // Load homepage
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // 🔥 THIS FIXES YOUR ERROR
    @PostMapping("/analyze")
    public String analyze(@RequestParam String numbers, Model model) {

        String[] parts = numbers.trim().split("[,\\s+]");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        List<Integer> lis = LISUtil.findLIS(arr);

        model.addAttribute("lis", lis);
        model.addAttribute("length", lis.size());

        return "index"; // SAME PAGE
    }
}