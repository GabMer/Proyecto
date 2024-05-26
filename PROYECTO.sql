PGDMP  .                    |            PROYECTO    15.7    16.3     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                        0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16399    PROYECTO    DATABASE     ~   CREATE DATABASE "PROYECTO" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE "PROYECTO";
                postgres    false            �            1259    16400    MARCAS    TABLE     h   CREATE TABLE public."MARCAS" (
    "ID" integer NOT NULL,
    "MARCA" character varying(20) NOT NULL
);
    DROP TABLE public."MARCAS";
       public         heap    postgres    false            �            1259    16428 	   PRODUCTOS    TABLE     �  CREATE TABLE public."PRODUCTOS" (
    "MARCA_ID" integer NOT NULL,
    "ID" integer NOT NULL,
    "MARCA" character varying(100) NOT NULL,
    "PAIS_DE_ORIGEN" character varying(100) NOT NULL,
    "DESCRIPCION_A" character varying(100),
    "DESCRIPCION_B" character varying(100),
    "TALLA" integer NOT NULL,
    "CANTIDAD" integer NOT NULL,
    "COLOR" character varying(100) NOT NULL,
    "CATEGORIA" character varying(100),
    "GENERO" character varying(100) NOT NULL,
    "TIPO" character varying(100),
    "PRECIO_DE_COMPRA" integer NOT NULL,
    "PRECIO_DE_VENTA" numeric NOT NULL,
    "UBICACION_DE_ALMACEN" integer NOT NULL,
    "UBICACION_DE_ARMAZON" integer NOT NULL
);
    DROP TABLE public."PRODUCTOS";
       public         heap    postgres    false            �          0    16400    MARCAS 
   TABLE DATA           1   COPY public."MARCAS" ("ID", "MARCA") FROM stdin;
    public          postgres    false    214   �       �          0    16428 	   PRODUCTOS 
   TABLE DATA             COPY public."PRODUCTOS" ("MARCA_ID", "ID", "MARCA", "PAIS_DE_ORIGEN", "DESCRIPCION_A", "DESCRIPCION_B", "TALLA", "CANTIDAD", "COLOR", "CATEGORIA", "GENERO", "TIPO", "PRECIO_DE_COMPRA", "PRECIO_DE_VENTA", "UBICACION_DE_ALMACEN", "UBICACION_DE_ARMAZON") FROM stdin;
    public          postgres    false    215   b       i           2606    16404    MARCAS MARCAS_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public."MARCAS"
    ADD CONSTRAINT "MARCAS_pkey" PRIMARY KEY ("ID");
 @   ALTER TABLE ONLY public."MARCAS" DROP CONSTRAINT "MARCAS_pkey";
       public            postgres    false    214            k           2606    16434    PRODUCTOS PRODUCTOS_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public."PRODUCTOS"
    ADD CONSTRAINT "PRODUCTOS_pkey" PRIMARY KEY ("ID");
 F   ALTER TABLE ONLY public."PRODUCTOS" DROP CONSTRAINT "PRODUCTOS_pkey";
       public            postgres    false    215            l           2606    16435    PRODUCTOS MARCA_ID    FK CONSTRAINT     �   ALTER TABLE ONLY public."PRODUCTOS"
    ADD CONSTRAINT "MARCA_ID" FOREIGN KEY ("MARCA_ID") REFERENCES public."MARCAS"("ID") NOT VALID;
 @   ALTER TABLE ONLY public."PRODUCTOS" DROP CONSTRAINT "MARCA_ID";
       public          postgres    false    214    3177    215            �   �  x�Q�n�0=�|�n=�0y9Ғ��I�B2T$�鄐D$�@���>͛���B%R�Rgd �J�k�ߟ1�B�W�������>�
q�-ބh���b�푬��!���.y��E�Y��B�Mf��"aP�I[ӻ��yc5I��pH��!Yýh��	����o� �����oҪ�
fi�FJ���EJ�(ڪ(�28~h�l���.5��$�yD��'�TZ�n��u.ۏ����d�lu�����#�KOI�����&/�o��A��� Gdj���ϡI&v��F�w��u�)�����t�B3��"�A3&������i��n���^���&8MK�hƫyOܜA+^r��t�����&���M��*9�?����� ����      �   (  x����r۸�������L�K �����n��g�i�7�D�L(ҥ$��o��>þXH�(?�@��D�>?��!C	%��z.�����Y<�U�4�ܭŪ[�$���iD;���ͪ#�B,g�n;�X-WuOh��ń���!�_���C��kd$!�Wo�/?��^,�f��Ȣ��?��)i���dI�C�E�$�"9�������\�Yݵ�h�n�Z�"�ڨ�ú]	��?�>��V^�A��_�dP�8E�V$� ��e�Wb�w���w�f|��%!��n���I�? 3q���D9�(��mտ^����k14�j�J�;����QHn�mL	f0 s���)x;7��^�f����ԏ-��[`s/6�m�=��Cl�v���	���Y��I ��n���I��,�:����ß�zb�}��Ն9�U"��żs�6 � �)�5$<��Y�FۧEȐ��*'���CǝX��B��	�tZ��Yy�.�cx���g-�W�y7�J�6s����-m�?}u��Ϫ�5����U���z%��n�e���M��"����2�ͽl��b'~6e���\��&����ZI�am��~*�SK�8>��nh�x��B�<.�Z��h���ąbGr0ݮW7]#����ӈ�nL�v^=t��~�7a7�q�w�L��Hp�]*#�
���!�t#�%I�\ϾW�Q:���ՍZ����ت~�ȃ\�ʱuׯ+��)'�u[-dIi��u�8^�He�Wj�D�M׫`�>Tu[��`<Hq�bC���X�f�c=i֙��z�TҹS^���ؕ�������ol#�y�}1��q��p�$!	V��%�T��^)�2]K�-��q��Ӎ�-��鮃߂['1~ #�V�cpM�G��x��g�a�ίA�~��دA�����"�v��e���-�d��o4�7l���7��?��Ǌ�frM{��0�}
ל7*�~��5�
<<�[�S��.S9t>�Dc�S�V���l�������c�쐙���Ce��(9ܢW��߶�h`�	ؚ���䜼}�����k�~�C��L�S���\���o� ;�r]ɠdʩ �̇-л�
����%��CQU�&�ZN�G�e�i��J̈́U�i�"��U������O��lx��?�؞|v/E+P�!�.�]�(	iN��v��>�ߺ�nk����+|�R >�e���"I/<��+���$����E�4lS�Id����k����wj��3F�ѱ�ls�)� �Rt�'!t��!�J���)�����������Ԝ�͙�4c�2�MuF����IΆ�W��3_V2U�~žR%�_���&*�|�K$TEX�|�1��������*e4�z��2*Ct�4�Y�B���N�'g�C;M�nzN��4N�Ϣ�?Nإ�uֽG�f�TU���e'p379��;��	����¸,�ܒ�������HLU�ʜ�"�J���)h(sB�釆r7_�����^�hhj��#zݥ���������C���!c���~�ND�O5�~���ѥ�BѲ=�h>ʌ����9�����ø��-�M�z����nw���r�ê�����٢�U�!�SHj:+��q�������i�)�t��۩��Z��������%Zz���LQyl��
�F��V��I-��c�Ke.h2���@�Jà��QW�F�y�����g;*�Rͳj|�P9��c=�Y�*[`2��
d�}���K�so�Ԧ�6+Dz[ы��@�J�mTMt�Mv�F��s���l�e�����=�TڰI�1�hhO��I�]t�&;��r�I��׺�! \�)K�d�Y
�%9�R-�5��1�;��0 �ozҵ��$٤eo���\�r���G�i>����h~������Im�ݗ���.�0�br�Q���H�(
)J�"����`A���]bٺ"�����Y�q�!���!<�e�4ǲ���������<%�x\V��8O�� >`�(|	��'���1��
Om�M���C����@WD�&��R�f'r���1�^�ʙ����������DC�1tT2��}���y��YƘ�ZL+r��#�촣 965o�����(q�l�y�;��ȧ%Z~�9e`~�8�
i��>}�_����D�i�A�	�kZ
@,)�ֆ��`������ltQ����2}�A,��`������.�_��Z[�0j#cD����}1Bk�ba��\A֧Q�HHɯ�f�X�Lp��"fvb@����*s�k5�W�aW�8W��u��w�N��U���K�`I	��"aq��`	�KX�DΛ�II;M�R�x��Eě�3�ޞp���� �	^���VA�2��}z�6�[������4��B�K�[w�E��}?��M>��á0<�I�q��|�$%��$'�A�L���ԑ@�e�*	P��U�]u���f'j�6?MPO��~:�2h����bFX{1S�0��w��ı��h
 @c@E�2����(۳ou�n�D�~n�����
LZ������ rn�ANSt�9i��Z&�7�^�Mg��zXu�H~E��"L�脋�����&W8W���U�����.|Tl�a�ub%�S#��Q�H�jfթ_�}U�9 �|�-��'2�]T}���/m���2~|��I�5?�����!�����s8?����R_ʱ�O�c���d��D��hH�Er �E-�cQN�����8�J�e2��VL�f��8�LN>�QS���E�����\{�����^�^�V��<����RB[H3q�f��Bsr]�wu}��j%i�/��?�Oص��z�9�֔H>iW��iL���w�d>�j^���o�@���d�����������Z�����kA
��� ;��F�F�d`;d���ȗ�y��z2��C��Z	�b;�R;�!�;4��y|x#	��v^�K�4���y�'�LN��|�E���r	)i4���:^�r�(`�*Q��_%*Ѣ����A䬧tv���U�(V��"��aE�.2���C.�����?_���K�[�)�F1�M���Dlj���S���j��z�z�Ds�u�``a _W��m���vߦ��;m*!��T�\�1�"�As���#M�n*zG^C����S�\B��藺����l�`IX[�Q��I�Q����r]�����o��>�0�V�Thb�$�Iu��;�|x'�\ i�N��C�vb�$�Õ�r���l���I]H?�7qUSks�&�>^w��ߡ��L�-8��t	���ջ/���+ ���̃uU�٩�����R ��dw�� ��j��)΂5������x�����r��     