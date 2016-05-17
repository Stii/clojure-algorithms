(ns hundred-doors.core
  (:gen-class))

(defn state-of-door
  "Determines whether a door is open or closed"
  [door-value]
  (if (= (mod door-value 1) 0.0)
    "Open"
    "Close"))
  
(defn door-str
  "Produces the string output for a door"
  [door]
  (str "#" door ": " (state-of-door (Math/sqrt door)) "\n"))

(defn -main
  "There are 100 doors in a long hallway. They are all closed. 
  The first time you walk by each door, you open it. The second 
  time around, you close every second door (since they are all opened). 
  On the third pass you stop at every third door and open it if it’s 
  closed, close it if it’s open. On the fourth pass, you take action on 
  every fourth door. You repeat this pattern for 100 passes.

  At the end of 100 passes, what doors are opened and what doors are closed?"
  [& args]
  (println (apply str (map door-str (range 1 101)))))
