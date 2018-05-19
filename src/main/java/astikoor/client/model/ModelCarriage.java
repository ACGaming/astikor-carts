// Date: 27.02.2018 20:19:00
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package astikoor.client.model;

import astikoor.entity.EntityCarriage;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCarriage extends ModelBase
{
    ModelRenderer StickFR;
    ModelRenderer StickFL;
    ModelRenderer StickBR;
    ModelRenderer StickBL;
    ModelRenderer BottomBoard;
    ModelRenderer DriverSeat;
    ModelRenderer DriverStick;
    ModelRenderer DriverStick2;
    ModelRenderer FrontBoard;
    ModelRenderer FrontBoard2;
    ModelRenderer SideLBoard;
    ModelRenderer SideLBoard2;
    ModelRenderer SideRBoard;
    ModelRenderer SideRBoard2;
    ModelRenderer Shape1;
    ModelRenderer FrontAxis;
    ModelRenderer ConnectorF;
    ModelRenderer ConnectorF2;
    ModelRenderer FrontAxis2;
    ModelRenderer Axis;
    ModelRenderer RearAxis;
    ModelRenderer Shape2;
    ModelRenderer RearAxis2;
    ModelRenderer ConnectorB;
    ModelRenderer ConnectorB2;
    ModelRenderer HorseStick;
    ModelRenderer HorseStick2;
    ModelRenderer HorseStick3;
    ModelRenderer HorseStick4;

    public ModelCarriage()
    {
        textureWidth = 256;
        textureHeight = 64;

        StickFR = new ModelRenderer(this, 0, 0);
        StickFR.addBox(-18F, -3F, -19F, 2, 12, 2);
        StickFR.setRotationPoint(0F, 0F, 0F);
        StickFR.setTextureSize(64, 32);
        StickFR.mirror = true;
        setRotation(StickFR, 0F, 0F, 0F);
        StickFL = new ModelRenderer(this, 0, 0);
        StickFL.addBox(16F, -3F, -19F, 2, 12, 2);
        StickFL.setRotationPoint(0F, 0F, 0F);
        StickFL.setTextureSize(64, 32);
        StickFL.mirror = true;
        setRotation(StickFL, 0F, 0F, 0F);
        StickBR = new ModelRenderer(this, 0, 0);
        StickBR.addBox(14F, -3F, 27F, 4, 12, 1);
        StickBR.setRotationPoint(0F, 0F, 0F);
        StickBR.setTextureSize(64, 32);
        StickBR.mirror = true;
        setRotation(StickBR, 0F, 0F, 0F);
        StickBL = new ModelRenderer(this, 0, 0);
        StickBL.addBox(-18F, -3F, 27F, 4, 12, 1);
        StickBL.setRotationPoint(0F, 0F, 0F);
        StickBL.setTextureSize(64, 32);
        StickBL.mirror = true;
        setRotation(StickBL, 0F, 0F, 0F);
        BottomBoard = new ModelRenderer(this, 0, 0);
        BottomBoard.addBox(-17F, 9F, -19F, 34, 1, 47);
        BottomBoard.setRotationPoint(0F, 0F, 0F);
        BottomBoard.setTextureSize(64, 32);
        BottomBoard.mirror = true;
        setRotation(BottomBoard, 0F, 0F, 0F);
        DriverSeat = new ModelRenderer(this, 0, 0);
        DriverSeat.addBox(-17F, 0F, -25F, 34, 1, 6);
        DriverSeat.setRotationPoint(0F, 0F, 0F);
        DriverSeat.setTextureSize(64, 32);
        DriverSeat.mirror = true;
        setRotation(DriverSeat, 0F, 0F, 0F);
        DriverStick = new ModelRenderer(this, 0, 0);
        DriverStick.addBox(16.5F, 0F, -1F, 1, 8, 1);
        DriverStick.setRotationPoint(0F, 0F, -23F);
        DriverStick.setTextureSize(64, 32);
        DriverStick.mirror = true;
        setRotation(DriverStick, 0.6632251F, 0F, 0F);
        DriverStick2 = new ModelRenderer(this, 0, 0);
        DriverStick2.addBox(-17.5F, 0F, -1F, 1, 8, 1);
        DriverStick2.setRotationPoint(0F, 0F, -23F);
        DriverStick2.setTextureSize(64, 32);
        DriverStick2.mirror = true;
        setRotation(DriverStick2, 0.6632251F, 0F, 0F);
        FrontBoard = new ModelRenderer(this, 178, 0);
        FrontBoard.addBox(-2F, -16F, -19F, 4, 32, 1);
        FrontBoard.setRotationPoint(0F, 0F, 0F);
        FrontBoard.setTextureSize(64, 32);
        FrontBoard.mirror = true;
        setRotation(FrontBoard, 0F, 0F, 1.570796F);
        FrontBoard2 = new ModelRenderer(this, 178, 0);
        FrontBoard2.addBox(4F, -16F, -19F, 4, 32, 1);
        FrontBoard2.setRotationPoint(0F, 0F, 0F);
        FrontBoard2.setTextureSize(64, 32);
        FrontBoard2.mirror = true;
        setRotation(FrontBoard2, 0F, 0F, 1.570796F);
        SideLBoard = new ModelRenderer(this, 178, 0);
        SideLBoard.addBox(17F, -17F, -2F, 1, 44, 4);
        SideLBoard.setRotationPoint(0F, 0F, 0F);
        SideLBoard.setTextureSize(64, 32);
        SideLBoard.mirror = true;
        setRotation(SideLBoard, 1.570796F, 0F, 0F);
        SideLBoard2 = new ModelRenderer(this, 178, 0);
        SideLBoard2.addBox(17F, -17F, -8F, 1, 44, 4);
        SideLBoard2.setRotationPoint(0F, 0F, 0F);
        SideLBoard2.setTextureSize(64, 32);
        SideLBoard2.mirror = true;
        setRotation(SideLBoard2, 1.570796F, 0F, 0F);
        SideRBoard = new ModelRenderer(this, 178, 0);
        SideRBoard.addBox(-18F, -17F, -2F, 1, 44, 4);
        SideRBoard.setRotationPoint(0F, 0F, 0F);
        SideRBoard.setTextureSize(64, 32);
        SideRBoard.mirror = true;
        setRotation(SideRBoard, 1.570796F, 0F, 0F);
        SideRBoard2 = new ModelRenderer(this, 178, 0);
        SideRBoard2.addBox(-18F, -17F, -8F, 1, 44, 4);
        SideRBoard2.setRotationPoint(0F, 0F, 0F);
        SideRBoard2.setTextureSize(64, 32);
        SideRBoard2.mirror = true;
        setRotation(SideRBoard2, 1.570796F, 0F, 0F);

        // FRONT AXIS
        FrontAxis = new ModelRenderer(this, 0, 0);
        this.FrontAxis.setRotationPoint(0.0F, 14.5F, -16F);
        FrontAxis.addBox(-19.0F, 2.0F, -1F, 38, 2, 2);
        FrontAxis.setTextureSize(64, 32);
        FrontAxis.mirror = true;
        setRotation(FrontAxis, 0F, 0F, 0F);
        HorseStick = new ModelRenderer(this, 0, 0);
        HorseStick.addBox(-2F, -2F, -11F, 1, 2, 11);
        HorseStick.setRotationPoint(-6F, -4.5F, -9F);
        HorseStick.setTextureSize(256, 64);
        HorseStick.mirror = true;
        setRotation(HorseStick, 2.513274F, 0F, 0F);
        HorseStick2 = new ModelRenderer(this, 0, 0);
        HorseStick2.addBox(0F, -2F, -11F, 1, 2, 11);
        HorseStick2.setRotationPoint(7F, -4.5F, -9F);
        HorseStick2.setTextureSize(256, 64);
        HorseStick2.mirror = true;
        setRotation(HorseStick2, 2.513274F, 0F, 0F);
        HorseStick3 = new ModelRenderer(this, 0, 0);
        HorseStick3.addBox(-8F, 10F, -47F, 1, 2, 22);
        HorseStick3.setRotationPoint(0F, -14.5F, 16F);
        HorseStick3.setTextureSize(256, 64);
        HorseStick3.mirror = true;
        setRotation(HorseStick3, 0F, 0F, 0F);
        HorseStick4 = new ModelRenderer(this, 0, 0);
        HorseStick4.addBox(7F, 10F, -47F, 1, 2, 22);
        HorseStick4.setRotationPoint(0F, -14.5F, 16F);
        HorseStick4.setTextureSize(256, 64);
        HorseStick4.mirror = true;
        setRotation(HorseStick4, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(19F, 10F, -24F, 1, 15, 15);
        Shape1.setRotationPoint(0F, -14.5F, 15F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        FrontAxis.addChild(HorseStick);
        FrontAxis.addChild(HorseStick2);
        FrontAxis.addChild(HorseStick3);
        FrontAxis.addChild(HorseStick4);
        FrontAxis.addChild(Shape1);

        ConnectorF = new ModelRenderer(this, 0, 0);
        ConnectorF.addBox(-1F, 0F, -16.5F, 1, 11, 1);
        ConnectorF.setRotationPoint(-14F, 9F, 0F);
        ConnectorF.setTextureSize(256, 64);
        ConnectorF.mirror = true;
        setRotation(ConnectorF, 0F, 0F, -1.047198F);
        ConnectorF2 = new ModelRenderer(this, 0, 0);
        ConnectorF2.addBox(0F, 0F, -2F, 1, 11, 1);
        ConnectorF2.setRotationPoint(14F, 9F, -14.5F);
        ConnectorF2.setTextureSize(256, 64);
        ConnectorF2.mirror = true;
        setRotation(ConnectorF2, 0F, 0F, 1.047198F);
        FrontAxis2 = new ModelRenderer(this, 0, 0);
        FrontAxis2.addBox(-6F, 14.5F, -17F, 12, 2, 2);
        FrontAxis2.setRotationPoint(0F, 0F, 0F);
        FrontAxis2.setTextureSize(256, 64);
        FrontAxis2.mirror = true;
        setRotation(FrontAxis2, 0F, 0F, 0F);
        Axis = new ModelRenderer(this, 0, 0);
        Axis.addBox(-1F, 14.5F, -13F, 2, 2, 33);
        Axis.setRotationPoint(0F, 0F, -2F);
        Axis.setTextureSize(256, 64);
        Axis.mirror = true;
        setRotation(Axis, 0F, 0F, 0F);
        RearAxis = new ModelRenderer(this, 0, 0);
        RearAxis.addBox(-19F, 16.5F, 18.5F, 38, 2, 2);
        RearAxis.setRotationPoint(0F, 0F, 0F);
        RearAxis.setTextureSize(256, 64);
        RearAxis.mirror = true;
        setRotation(RearAxis, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(19F, 10F, 12F, 1, 15, 15);
        Shape2.setRotationPoint(0F, 0F, 0F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        RearAxis2 = new ModelRenderer(this, 0, 0);
        RearAxis2.addBox(-6F, 14.5F, 18F, 12, 2, 2);
        RearAxis2.setRotationPoint(0F, 0F, 0F);
        RearAxis2.setTextureSize(256, 64);
        RearAxis2.mirror = true;
        setRotation(RearAxis2, 0F, 0F, 0F);
        ConnectorB = new ModelRenderer(this, 0, 0);
        ConnectorB.addBox(-1F, 0F, 18.5F, 1, 11, 1);
        ConnectorB.setRotationPoint(-14F, 9F, 0F);
        ConnectorB.setTextureSize(256, 64);
        ConnectorB.mirror = true;
        setRotation(ConnectorB, 0F, 0F, -1.047198F);
        ConnectorB2 = new ModelRenderer(this, 0, 0);
        ConnectorB2.addBox(0F, 0F, 18.5F, 1, 11, 1);
        ConnectorB2.setRotationPoint(14F, 9F, 0F);
        ConnectorB2.setTextureSize(256, 64);
        ConnectorB2.mirror = true;
        setRotation(ConnectorB2, 0F, 0F, 1.047198F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        StickFR.render(f5);
        StickFL.render(f5);
        StickBR.render(f5);
        StickBL.render(f5);
        BottomBoard.render(f5);
        DriverSeat.render(f5);
        DriverStick.render(f5);
        DriverStick2.render(f5);
        FrontBoard.render(f5);
        FrontBoard2.render(f5);
        SideLBoard.render(f5);
        SideLBoard2.render(f5);
        SideRBoard.render(f5);
        SideRBoard2.render(f5);
        FrontAxis.render(f5);
        ConnectorF.render(f5);
        ConnectorF2.render(f5);
        FrontAxis2.render(f5);
        Axis.render(f5);
        RearAxis.render(f5);
        Shape2.render(f5);
        RearAxis2.render(f5);
        ConnectorB.render(f5);
        ConnectorB2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale, Entity entity)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, rotationYaw, rotationPitch, scale, entity);
        this.FrontAxis.rotateAngleY = (float) (((EntityCarriage) entity).axisYawRadian - Math.toRadians(entity.rotationYaw));
    }

}
