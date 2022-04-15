# Design-Pattern-Project
Project for MassBay CS225
Part 1 (40%):

Use the Composite pattern to define a class CompositeIcon that implements the Icon interface type (check the API) and contains a list of icons. It should have a method

void addIcon(Icon icon, int x, int y), where x and y are the x and y coordinates of the icon.

Create two concrete classes that implement Icon and in the tester create objects of these and add them to the composite object. Then draw the objects by drawing the composite. 

 

Part 2 (30%):

Use one of the Icon-based classes (not the composite one) and use the Adapter pattern to create an adapter, which turns the Icon object to a GUI component (a JComponent). So, the only attribute of the adapter is an Icon type object.

Add a tester to view the GUI.

 

Part 3 (30%): 

Pick one pattern, which you feel could have been used (or would have been useful) in your previous lab/project work AND is different than the ones used in parts 1 and 2. 

Read about it, understand the example, and then write how you would have used it in your program design. Show the design.
