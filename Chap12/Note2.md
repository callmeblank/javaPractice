- You can draw 2D graphics directly on to a widget.
- You can draw a .gif or .jpeg directly on to a widget.
- To draw your own graphics (including a .gif or
.jpeg), make a subclass of JPanel and override the
paintComponent() method.
- The paintComponent() method is called by the GUI
system. YOU NEVER CALL IT YOURSELF. The
argument to paintComponent() is a Graphics object that
gives you a surface to draw on, which will end up on
the screen. You cannot construct that object yourself.
- Typical methods to call on a Graphics object (the
paintComponent paramenter) are:
g.setColor(Color.blue);
g.fillRect(20,50,100,120);
- To draw a .jpg, construct an Image using:
Image image = new ImageIcon(“catzilla.
jpg”).getImage();
and draw the image using:
g.drawImage(image,3,4,this);
- The object referenced by the Graphics parameter
to paintComponent() is actually an instance of the
Graphics2D class. The Graphics 2D class has a variety
of methods including:
fill3DRect(), draw3DRect(), rotate(), scale(), shear(), 
transform()
- To invoke the Graphics2D methods, you must cast the
parameter from a Graphics object to a Graphics2D
object:
Graphics2D g2d = (Graphics2D) g;