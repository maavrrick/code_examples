//
//  ViewController.swift
//  ornaments
//
//  Created by Kindra Hensley on 8/22/16.
//  Copyright © 2016 maavrrick. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var blue: UIImageView!
    @IBOutlet weak var hideBlue: UIButton!
    
    @IBOutlet weak var red: UIImageView!
    @IBOutlet weak var hideRed: UIButton!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func hideBlue(sender: AnyObject) {
        blue.hidden = true
        red.hidden = false
    }
    
    @IBAction func hideRed(sender: AnyObject) {
        blue.hidden = false
        red.hidden = true
    }


}

