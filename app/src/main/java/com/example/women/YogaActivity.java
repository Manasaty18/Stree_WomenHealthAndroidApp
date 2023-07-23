package com.example.women;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class YogaActivity extends AppCompatActivity {
    ImageView imageView11, imageView12, imageView13;
    ImageView imageView21, imageView22, imageView23, imageView24;
    ImageView imageView31, imageView32, imageView33, imageView34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);

        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView24 = (ImageView) findViewById(R.id.imageView24);

        imageView31 = (ImageView) findViewById(R.id.imageView31);
        imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView33 = (ImageView) findViewById(R.id.imageView33);
        imageView34 = (ImageView) findViewById(R.id.imageView34);


        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Jana Sirasana\n(Head-to-knee forward bend)";
                String information = "This forward bend strengthens your back muscles, stimulates digestion, and promotes relaxation. It stretches your back, hips, and legs.\n" +
                        "\n" +
                        "1. Sit on the edge of a cushion, block, or folded blanket with your left leg extended.\n" +
                        "2. Place the sole of left foot against inner right thigh.\n" +
                        "3. Inhale as you reach arms overhead.\n" +
                        "4. Exhale to fold forward slightly, lengthening the front of your torso.\n" +
                        "5. Place your hands on your body or the floor.\n" +
                        "6. Hold this position for up to 1 minute.\n" +
                        "7. Repeat on the other side.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Upavistha konasana\n(Wide-angle seated forward bend)";
                String information = "This pose increases flexibility in your low back, hips, and legs. It builds strength in your spine, low back, and pelvis.\n" +
                        "\n" +
                        "1. Sit on the edge of a cushion, block, or folded blanket, with your legs out to the side, allowing your pelvis to tilt forward.\n" +
                        "2. Reach arms overhead.\n" +
                        "3. Bend at your hips as you fold forward.\n" +
                        "4. Place hands in front of you or take hold of your big toes.\n" +
                        "5. Hold this position for up to 1 minute.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Marjaryasana to Bitilasana\n(Cat-cow pose)";
                String information = "This gentle backbend relieves tension, improves spinal mobility, and boosts circulation. You’ll feel a nice stretch in your neck, shoulders, and torso.\n" +
                        "\n" +
                        "1. Start on all fours.\n" +
                        "2. Inhale as you arch your spine, lower your belly, and gaze upward.\n" +
                        "3. Exhale as you draw chin into chest and arch spine upward.\n" +
                        "4. Continue this gentle flow for up to 1 minute.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Baddha Konasana\n(Bound angle pose)";
                String information = "The butterfly stretch boosts circulation, stimulates your digestive organs, and promotes relaxation. It improves flexibility in your low back, hips, and inner thighs, which helps prepare your body for delivery.\n" +
                        "\n" +
                        "1. Sit on the edge of a cushion, block, or folded blanket, allowing your pelvis to tilt forward.\n" +
                        "2. Press the soles of your feet together.\n" +
                        "3. Bring feet in toward hips to deepen the stretch.\n" +
                        "4. Root your lower body into the floor as you lengthen your spine.\n" +
                        "5. Interlace fingers under pinky toes or place hands on your ankles or shins.\n" +
                        "6. Hold this position for up to 1 minute.\n" +
                        "7. Repeat 2–4 times.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Balasana\n(Child’s pose)";
                String information = "This relaxing pose stretches your shoulders, chest, and low back. It increases flexibility in your spine, hips, and thighs.\n" +
                        "\n" +
                        "1. Start on all fours.\n" +
                        "2. Touch big toes together and spread knees wide.\n" +
                        "3. Lower your hips back onto your heels.\n" +
                        "4. Reach arms in front of you.\n" +
                        "5. Breathe deeply.\n" +
                        "6. Hold this pose for up to 1 minute.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Trikonasana\n(Triangle pose)";
                String information = "This strengthening pose gives you a burst of energy while relieving neck and back tension.\n" +
                        "\n" +
                        "1. Start in a standing position.\n" +
                        "2. Step left foot forward to widen your stance. The left foot’s toes are pointed ahead. Keep the left knee straight so there is no bend\n" +
                        "3. Slightly angle the back foot (right foot) , so there is more stability.\n" +
                        "4. Open your hips by rotating your hips and torso from the center to the right.\n" +
                        "5. Slowly reach the left arm down towards the left ankle. Here you have the option to place the left on a block on inside of of your left leg, on your leg, or on the floor.\n" +
                        "6. Reach the right arm up above the right shoulder. Right palm facing away from the body.\n" +
                        "7. Hold this pose for 30 seconds\n" +
                        "8. Repeat on the other side.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Uttanasana\n(Standing forward bend)";
                String information = "This pose relieves tension and promotes inner calm.\n" +
                        "\n" +
                        "1. Stand with feet slightly wider than hips.\n" +
                        "2. Hinge at your hips to fold forward.\n" +
                        "3. Keep knees slightly bent.\n" +
                        "4. Place hands on the floor or a block or hold opposite elbows.\n" +
                        "5. Hold this pose for up to 30 seconds.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Virabhadrasana II\n(Warrior II)";
                String information = "Warrior II improves circulation, strengthens your whole body, and opens your hips. It also relieves neck and back pain. This pose allows you to experiment with your center of gravity as you align your body.\n" +
                        "\n" +
                        "1. From standing, step left foot back and turn toes out to the left slightly.\n" +
                        "2. Align the inside of left foot so it’s in line with right heel.\n" +
                        "3. Open your hips to face the side.\n" +
                        "4. Raise your arms to be parallel to the floor, with palms facing down.\n" +
                        "5. Bend right knee, making sure it doesn’t extend past your ankle.\n" +
                        "6. Gaze over your front middle finger.\n" +
                        "7. Hold this pose for 30 seconds.\n" +
                        "8. Repeat on the other side.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Sukhasana\n(Easy pose)";
                String information = "This classic seated pose lengthens your spine, opens your hips, and promotes mental clarity.\n" +
                        "\n" +
                        "1. Sit on the edge of a cushion, block, or folded blanket, allowing your pelvis to tilt forward.\n" +
                        "2. Cross right leg over left leg.\n" +
                        "3. Place hands in any comfortable position.\n" +
                        "4. Close your eyes and breathe deeply.\n" +
                        "5. Hold this position for up to 1 minute.\n" +
                        "6. Repeat on the other side.\n";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Malasana\n(Garland pose)";
                String information = "This deep squat opens your hips and boosts digestion. Avoid this pose if you’re prone to prolapse.\n" +
                        "\n" +
                        "1. Stand with feet slightly wider than hips and toes turned out at an angle.\n" +
                        "2. Slowly bend knees and lower your hips.\n" +
                        "3. Lift your heels or place them on the floor.\n" +
                        "4. Press palms together at the center of your chest.\n" +
                        "5. Press elbows into knees.\n" +
                        "6. Hold this position for up to 30 seconds.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heading = "Parsva Savasana\n(Side corpse pose)";
                String information = "This restorative pose relieves fatigue and enhances relaxation.\n" +
                        "\n" +
                        "1. Lie on your left side.\n" +
                        "2. Keep left leg straight.\n" +
                        "3. Bend right knee and support it with cushions.\n" +
                        "4. Place a cushion under your head.\n" +
                        "5. Relax in this position for 15 minutes.";
                Intent intent = new Intent(YogaActivity.this, InformationActivity.class);
                intent.putExtra("heading", heading);
                intent.putExtra("information",information);
                startActivity(intent);
            }
        });

    }
}