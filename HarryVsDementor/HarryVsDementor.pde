class GameObject {
  public boolean isAlive = true;
  public int x;
  public int y;
  public int w;
  public int h;
  public GameObject(int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }

  public void update() {
  }
  public void render() {
  }
}

class Player extends GameObject {
  public boolean up = false;
  public boolean down = false;
  public boolean left = false;
  public boolean right = false;
  public boolean canLaunchSpell = true;

  public int speed = 3;

  public Player(int x, int y, int w, int h) {
    super(x, y, w, h);
  }

  public void update() {
    if (up) {
      y -= speed;
    }
    if (down) {
      y += speed;
    }
    if (left) {
      x -= speed;
    }
    if (right) {
      x += speed;
    }
  }
  public void render() {
    fill(0, 0, 255);
    ellipse(x, y, w, h);
  }
}

class Spell extends GameObject {

  public double xSpeed = 0;
  public double ySpeed = 0;
  public double maxSpeed = 10;

  public Spell(int x, int y, int w, int h) {
    super(x, y, w, h);
  }

  public void update() {
    x += xSpeed * maxSpeed;
    y += ySpeed * maxSpeed;
    if (x < 0 || x > width || y < 0 || y > height) {
      isAlive = false;
    }
  }

  public void render() {
    fill(255, 255, 0);
    ellipse(x, y, w, h);
  }
}

class Monster extends GameObject {
  public double xSpeed = 0;
  public double ySpeed = 0;
  public double maxSpeed = 0;

  public Monster(int x, int y, int w, int h) {
    super(x, y, w, h);
  }

  public void update() {
    x += xSpeed * maxSpeed;
    y += ySpeed * maxSpeed;
  }

  public void render() {
    fill(0, 0, 0);
    ellipse(x, y, w, h);
  }
}

ArrayList<Spell> spells = new ArrayList<Spell>();
ArrayList<Monster> monsters = new ArrayList<Monster>();
Player player = new Player(300, 300, 50, 50);
int score = 0;
long monsterTimer;
int monsterInterval = 1000;
double currentMonsterSpeed = 2;
void setup() {
  size(600, 600);

  monsterTimer = System.currentTimeMillis();
}

void draw() {
  if (player.isAlive) {

    player.update();

    for (int i = 0; i < spells.size(); i++) {
      Spell s = spells.get(i);
      s.update();

      for (Monster d : monsters) {
        if (dist(d.x, d.y, s.x, s.y) <= d.w / 2 + s.w / 2) {
          d.isAlive = false;
          s.isAlive = false;
          score++;
        }
      }

      if (!s.isAlive) {
        spells.remove(i);
      }
    }

    if (System.currentTimeMillis() - monsterTimer >= monsterInterval) {
      int r = (int)random(0, 3);

      Monster d = null;
      switch(r) {
      case 0:
        {
          d = new Monster((int)random(0, width), 0, 50, 50);
          break;
        }
      case 1:
        {
          d = new Monster((int)random(0, width), height, 50, 50);
          break;
        }
      case 2:
        {
          d = new Monster(width, (int)random(0, height), 50, 50);
          break;
        }
      case 3:
        {
          d = new Monster(0, (int)random(0, height), 50, 50);
        }
      default:
        {
          break;
        }
      }

      int xdif = player.x - d.x;
      int ydif = player.y - d.y;

      double angle = Math.atan2((double) ydif, (double) xdif);

      d.xSpeed = Math.cos(angle);
      d.ySpeed = Math.sin(angle);
    
      d.maxSpeed = currentMonsterSpeed;
      currentMonsterSpeed += 0.1;

      monsters.add(d);
      monsterTimer = System.currentTimeMillis();
      monsterInterval = (int)random(500, 1500);
    }

    for (int i = 0; i < monsters.size(); i++) {
      Monster d = monsters.get(i);

      int xdif = player.x - d.x;
      int ydif = player.y - d.y;

      double angle = Math.atan2((double) ydif, (double) xdif);

      d.xSpeed = Math.cos(angle);
      d.ySpeed = Math.sin(angle);

      if (dist(d.x, d.y, player.x, player.y) <= player.w) {
        player.isAlive = false;
      }

      d.update();
      if (!d.isAlive) {
        monsters.remove(i);
      }
    }

    background(200);

    player.render();

    for (Spell s : spells) {
      s.render();
    }
    for (Monster d : monsters) {
      d.render();
    }
  } else {
    background(0);
    fill(255, 0, 0);
    textSize(32);
    text("You have been eaten!\nYou killed " + score + " dementors.\nPress r to restart.", 50, 200); 
  }
}

void resetGame(){
   monsters.clear();
   spells.clear();
   score = 0;
   currentMonsterSpeed = 2;
   player.x = 300;
   player.y = 300;
   player.isAlive = true;
   monsterTimer = System.currentTimeMillis();
}

void mousePressed() {
  if (player.canLaunchSpell) {
    Spell s = new Spell(player.x, player.y, 20, 20);
    int xdif = mouseX - player.x;
    int ydif = mouseY - player.y;

    double angle = Math.atan2((double) ydif, (double) xdif);

    s.xSpeed = Math.cos(angle);
    s.ySpeed = Math.sin(angle);

    spells.add(s);

    player.canLaunchSpell = false;
  }
}

void mouseReleased() {

  player.canLaunchSpell = true;
}

void keyPressed() {
  if (key == 'w') {
    player.up = true;
  }
  if (key == 's') {
    player.down = true;
  }
  if (key == 'a') {
    player.left = true;
  }
  if (key == 'd') {
    player.right = true;
  }
  if(!player.isAlive && key == 'r'){
    resetGame();
  }
}

void keyReleased() {
  if (key == 'w') {
    player.up = false;
  }
  if (key == 's') {
    player.down = false;
  }
  if (key == 'a') {
    player.left = false;
  }
  if (key == 'd') {
    player.right = false;
  }
}
