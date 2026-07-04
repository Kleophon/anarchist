{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  name = "minecraft-dev-env";

  buildInputs = with pkgs; [
    jdk21
    libX11
    libXcursor
    libXrandr
    libXinerama
    libXi
    libGL
    vulkan-loader
  ];

  shellHook = ''
    export LD_LIBRARY_PATH="/run/opengl-driver/lib:${with pkgs; pkgs.lib.makeLibraryPath [
      libX11
      libXcursor
      libXrandr
      libXinerama
      libXi
      libGL
      vulkan-loader
    ]}"
    echo "Minecraft development environment loaded with GLX hardware paths!"
  '';
}
