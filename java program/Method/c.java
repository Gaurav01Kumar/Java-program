package pong;
 import java.awt.Color;
 import java.awt.Graphics2D;

14 public class FieldWall {

 WallUnit[] aWall = new WallUnit[4];
1 public FieldWall() {
1 initFieldWall();
20 }
 private void initFieldWall() {
2WallUnit topUnit = new WallUnit();
 topUnit.setX(Consts.MINX);
25 topUnit.setY(Consts.MINY);
26 topUnit.setWidth(Consts.MAXX - Consts.MINX);
 topUnit.setHeight(Consts.WALL_THICK);
 aWall[0] = topUnit;
 WallUnit bottomUnit = new WallUnit();
30 bottomUnit.setX(Consts.MINX);
3bottomUnit.setY(Consts.MAXY - Consts.WALL_THICK);
3bottomUnit.setWidth(Consts.MAXX - Consts.MINX);
 bottomUnit.setHeight(Consts.WALL_THICK);
34 aWall[1] = bottomUnit;
35 WallUnit leftUnit = new WallUnit();
36 leftUnit.setX(Consts.MINX);
3 leftUnit.setY(Consts.MINY);
3 leftUnit.setWidth(Consts.WALL_THICK);
3 leftUnit.setHeight(Consts.MAXY - Consts.MINY);
 aWall
] = leftUnit;
WallUnit rightUnit = new WallUnit();
rightUnit.setX(Consts.MAXX - Consts.WALL_THICK);
 rightUnit.setY(Consts.MINY);
 rightUnit.setWidth(Consts.WALL_THICK);
 rightUnit.setHeight(Consts.MAXY - Consts.MINY);
 aWall[3] = rightUnit;
 for (int i = 0; i < 4; i++) {
 aWall[i].setUnitColor(Color.decode("#bbaa00"));
 }
 }

 public void paintFieldWall(Graphic2D g2d) {
for (int i = 0; i < 4; i++) {
 aWall[i].paintUnit(g2d);
 }
 }
 }
 