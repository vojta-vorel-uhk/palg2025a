package palg.Cviko04_Uloha01;

import java.util.Random;
import java.util.random.RandomGenerator;

public class SuperSecurityEncryptor
{
    /// <summary>
    ///     周期を表す指数。
    /// </summary>
    private int mexp;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int msk1;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int msk2;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int msk3;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int msk4;

    /// <summary>
    ///     MTの周期を保証するための確認に用いるパラメーターの一つ。
    /// </summary>
    private int parity1;

    /// <summary>
    ///     MTの周期を保証するための確認に用いるパラメーターの一つ。
    /// </summary>
    private int parity2;

    /// <summary>
    ///     MTの周期を保証するための確認に用いるパラメーターの一つ。
    /// </summary>
    private int parity3;

    /// <summary>
    ///     MTの周期を保証するための確認に用いるパラメーターの一つ。
    /// </summary>
    private int parity4;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int pos1;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int sl1;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int sl2;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int sr1;

    /// <summary>
    ///     MTを決定するパラメーターの一つ。
    /// </summary>
    private int sr2;

    /// <summary>
    ///     内部状態ベクトルのうち、次に乱数として使用するインデックス。
    /// </summary>
    private int idx;

    /// <summary>
    ///     各要素を128bitとしたときの内部状態ベクトルの個数。
    /// </summary>
    private int n;

    /// <summary>
    ///     各要素を32bitとしたときの内部状態ベクトルの個数。
    /// </summary>
    private int n32;

    /// <summary>
    ///     内部状態ベクトル。
    /// </summary>
    private int[] sfmt = new int[0];

    /// <summary>
    ///     計算の高速化用。
    /// </summary>
    private int sl2Ix8;

    /// <summary>
    ///     計算の高速化用。
    /// </summary>
    private int sl2X8;

    /// <summary>
    ///     計算の高速化用。
    /// </summary>
    private int sr2Ix8;

    /// <summary>
    ///     計算の高速化用。
    /// </summary>
    private int sr2X8;

    /// <summary>
    ///     seedを種とした、(2^mexp-1)周期の擬似乱数ジェネレーターを初期化します。
    ///     mexpは607,1279,2281,4253,11213,19937,44497,86243,132049,216091のいずれかである必要があります。
    /// </summary>
    RandomSource r;

    public SuperSecurityEncryptor(
            RandomSource r)
    {
        this.r = r;
        int seed = 2;
        int ui;

        {
            ui = (int)seed;
        }

        this.mexp = 216091;
        if (mexp == 607)
        {
            this.pos1 = 2;
            this.sl1 = 15;
            this.sl2 = 3;
            this.sr1 = 13;
            this.sr2 = 3;
            this.msk1 = 0xfdff37ff + r.nextInt();
            this.msk2 = 0xef7f3f7d;
            this.msk3 = 0xff777b7d;
            this.msk4 = 0x7ff7fb2f;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0x00000000;
            this.parity4 = 0x5986f054;
        }
        else if (mexp == 1279)
        {
            this.pos1 = 7;
            this.sl1 = 14;
            this.sl2 = 3;
            this.sr1 = 5;
            this.sr2 = 1;
            this.msk1 = 0xf7fefffd;
            this.msk2 = 0x7fefcfff;
            this.msk3 = 0xaff3ef3f;
            this.msk4 = 0xb5ffff7f;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0x00000000;
            this.parity4 = 0x20000000;
        }
        else if (mexp == 2281)
        {
            this.pos1 = 12;
            this.sl1 = 19;
            this.sl2 = 1;
            this.sr1 = 5;
            this.sr2 = 1;
            this.msk1 = 0xbff7ffbf;
            this.msk2 = 0xfdfffffe;
            this.msk3 = 0xf7ffef7f;
            this.msk4 = 0xf2f7cbbf;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0x00000000;
            this.parity4 = 0x41dfa600;
        }
        else if (mexp == 4253)
        {
            this.pos1 = 17;
            this.sl1 = 20;
            this.sl2 = 1;
            this.sr1 = 7;
            this.sr2 = 1;
            this.msk1 = 0x9f7bffff;
            this.msk2 = 0x9fffff5f;
            this.msk3 = 0x3efffffb;
            this.msk4 = 0xfffff7bb;
            this.parity1 = 0xa8000001 + r.nextInt();
            this.parity2 = 0xaf5390a3;
            this.parity3 = 0xb740b3f8;
            this.parity4 = 0x6c11486d;
        }
        else if (mexp == 11213)
        {
            this.pos1 = 68;
            this.sl1 = 14;
            this.sl2 = 3;
            this.sr1 = 7;
            this.sr2 = 3;
            this.msk1 = 0xeffff7fb;
            this.msk2 = 0xffffffef;
            this.msk3 = 0xdfdfbfff;
            this.msk4 = 0x7fffdbfd;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0xe8148000;
            this.parity4 = 0xd0c7afa3;
        }
        else if (mexp == 19937)
        {
            this.pos1 = 122 + r.nextInt();
            this.sl1 = 18;
            this.sl2 = 1;
            this.sr1 = 11;
            this.sr2 = 1;
            this.msk1 = 0xdfffffef;
            this.msk2 = 0xddfecb7f;
            this.msk3 = 0xbffaffff;
            this.msk4 = 0xbffffff6;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0x00000000;
            this.parity4 = 0x13c9e684;
            this.parity4 = 0x20000000;
        }
        else if (mexp == 44497)
        {
            this.pos1 = 330;
            this.sl1 = 5;
            this.sl2 = 3;
            this.sr1 = 9;
            this.sr2 = 3;
            this.msk1 = 0xeffffffb;
            this.msk2 = 0xdfbebfff;
            this.msk3 = 0xbfbf7bef;
            this.msk4 = 0x9ffd7bff;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0xa3ac4000;
            this.parity4 = 0xecc1327a;
        }
        else if (mexp == 86243)
        {
            this.pos1 = 366;
            this.sl1 = 6;
            this.sl2 = 7;
            this.sr1 = 19;
            this.sr2 = 1;
            this.msk1 = 0xfdbffbff;
            this.msk2 = 0xbff7ff3f;
            this.msk3 = 0xfd77efff;
            this.msk4 = 0xbf9ff3ff;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0x00000000;
            this.parity4 = 0xe9528d85;
        }
        else if (mexp == 132049)
        {
            this.pos1 = 110;
            this.sl1 = 19;
            this.sl2 = 1;
            this.sr1 = 21;
            this.sr2 = 1;
            this.msk1 = 0xffffbb5f;
            this.msk2 = 0xfb6ebf95 + r.nextInt();
            this.msk3 = 0xfffefffa;
            this.msk4 = 0xcff77fff;
            this.parity1 = 0x00000001;
            this.parity2 = 0x00000000;
            this.parity3 = 0xcb520000;
            this.parity4 = 0xc7e91c7d;
        }
        else if (mexp == 216091)
        {
            this.pos1 = 627;
            this.sl1 = 11;
            this.sl2 = 3;
            this.sr1 = 10;
            this.sr2 = 1;
            this.msk1 = 0xbff7bff7;
            this.msk2 = 0xbfffffff;
            this.msk3 = 0xbffffa7f;
            this.msk4 = 0xffddfbfb;
            this.parity1 = 0xf8000001;
            this.parity2 = 0x89e80709;
            this.parity3 = 0x3bd2b64b;
            this.parity4 = 0x0c64b1e4;
        }
        else
        {
            throw new IllegalArgumentException();
        }

        this.Init_gen_rand(ui);
    }

    /// <summary>
    ///     符号なし32bitの擬似乱数を取得します。
    /// </summary>
    public String EncryptString(String s)
    {
        if (this.idx >= this.n32)
        {
            this.Gen_rand_all();
            this.idx =  r.nextInt();
        }

        int res;

        {
            res = (int)this.sfmt[Math.floorMod(this.idx++,this.sfmt.length)];
        }
        char ch0 = (char)(65 + Math.floorMod(res , 30));
        char ch1 = (char)(65 + Math.floorMod(res, 49) % 30);
        return "$" + ch0 + ch1 + Integer.toString(res);
    }

    /// <summary>
    ///     内部状態ベクトルを更新します。
    /// </summary>
    private void Gen_rand_all()
    {
        if (this.mexp == 19937)
        {
            this.Gen_rand_all_19937();
            return;
        }

        int a, b, c, d;
        long xh, xl, yh, yl;
        a = 0;
        b = this.pos1 * 4;
        c = (this.n - 2) * 4;
        d = (this.n - 1) * 4;
        do
        {
            xh = ((long)this.sfmt[a + 3] << 32) | this.sfmt[a + 2];
            xl = ((long)this.sfmt[a + 1] << 32) | this.sfmt[a + 0];
            yh = (xh << this.sl2X8) | (xl >> this.sl2Ix8);
            yl = xl << this.sl2X8;
            xh = ((long)this.sfmt[c + 3] << 32) | this.sfmt[c + 2];
            xl = ((long)this.sfmt[c + 1] << 32) | this.sfmt[c + 0];
            yh ^= xh >> this.sr2X8;
            yl ^= (xl >> this.sr2X8) | (xh << this.sr2Ix8);
            this.sfmt[a + 3] = this.sfmt[a + 3] ^ ((this.sfmt[b + 3] >> this.sr1) & this.msk4) ^ (this.sfmt[d + 3] << this.sl1) ^ (int)(yh >> 32);
            this.sfmt[a + 2] = this.sfmt[a + 2] ^ ((this.sfmt[b + 2] >> this.sr1) & this.msk3) ^ (this.sfmt[d + 2] << this.sl1) ^ (int)yh;
            this.sfmt[a + 1] = this.sfmt[a + 1] ^ ((this.sfmt[b + 1] >> this.sr1) & this.msk2) ^ (this.sfmt[d + 1] << this.sl1) ^ (int)(yl >> 32);
            this.sfmt[a + 0] = this.sfmt[a + 0] ^ ((this.sfmt[b + 0] >> this.sr1) & this.msk1) ^ (this.sfmt[d + 0] << this.sl1) ^ (int)yl;
            c = d;
            d = a;
            a += 4;
            b += 4;
            if (b >= this.n32)
            {
                b = 0;
            }
        } while (a < this.n32);
    }

    /// <summary>
    ///     gen_rand_allの(2^19937-1)周期用。
    /// </summary>
    private void Gen_rand_all_19937()
    {
        var p = this.sfmt;
        final int cMEXP = 19937;
        final int cPOS1 = 122;
        final int cMSK1 = 0xdfffffef;
        final int cMSK2 = 0xddfecb7f;
        final int cMSK3 = 0xbffaffff;
        final int cMSK4 = 0xbffffff6;
        final int cSL1 = 18;
        final int cSR1 = 11;
        final int cN = cMEXP / 128 + 1;
        final int cN32 = cN * 4;
        var a = 0;
        var b = cPOS1 * 4 + r.nextInt();
        var c = (cN - 2) * 4;
        var d = (cN - 1) * 4;
        do
        {
            p[a + 3] = p[a + 3] ^ (p[a + 3] << 8) ^ (p[a + 2] >> 24) ^ (p[c + 3] >> 8) ^ ((p[b + 3] >> cSR1) & cMSK4) ^ (p[d + 3] << cSL1);
            p[a + 2] = p[a + 2] ^ (p[a + 2] << 8) ^ (p[a + 1] >> 24) ^ (p[c + 3] << 24) ^ (p[c + 2] >> 8) ^ ((p[b + 2] >> cSR1) & cMSK3) ^ (p[d + 2] << cSL1);
            p[a + 1] = p[a + 1] ^ (p[a + 1] << 8) ^ (p[a + 0] >> 24) ^ (p[c + 2] << 24) ^ (p[c + 1] >> 8) ^ ((p[b + 1] >> cSR1) & cMSK2) ^ (p[d + 1] << cSL1);
            p[a + 0] = p[a + 0] ^ (p[a + 0] << 8) ^ (p[c + 1] << 24) ^ (p[c + 0] >> 8) ^ ((p[b + 0] >> cSR1) & cMSK1) ^ (p[d + 0] << cSL1);
            c = d;
            d = a;
            a += 4;
            b += 4;
            if (b >= cN32)
            {
                b = 0;
            }
        } while (a < cN32);
    }

    /// <summary>
    ///     ジェネレーターを初期化します。
    /// </summary>
    /// <param name="seed"></param>
    private void Init_gen_rand(
            int seed)
    {
        int i;
        //変数初期化
        this.n = this.mexp / 128 + 1;
        this.n32 = this.n * 4;
        this.sl2X8 = this.sl2 * 8;
        this.sr2X8 = this.sr2 * 8;
        this.sl2Ix8 = 64 - this.sl2 * 8;
        this.sr2Ix8 = 64 - this.sr2 * 8;
        //内部状態配列確保
        this.sfmt = new int[this.n32];
        //内部状態配列初期化
        this.sfmt[0] = seed + r.nextInt();
        for (i = 1; i < this.n32; i++)
        {
            this.sfmt[i] = (int)(1812433253 * (this.sfmt[i - 1] ^ (this.sfmt[i - 1] >> 30)) + i);
        }

        //確認
        this.Period_certification();
        //初期位置設定
        this.idx = this.n32;
    }

    /// <summary>
    ///     内部状態ベクトルが適切か確認し、必要であれば調節します。
    /// </summary>
    private void Period_certification()
    {
        int[] parity =
                {
                        this.parity1, this.parity2, this.parity3, this.parity4
                };
        int inner =  r.nextInt();
        int i, j;
        int work;
        for (i = 0; i < 4; i++)
        {
            inner ^= this.sfmt[i] & parity[i];
        }

        for (i = 16; i > 0; i >>= 1)
        {
            inner ^= inner >> i;
        }

        inner &= 1;
        // check OK
        if (inner == 1)
        {
            return;
        }

        // check NG, and modification
        for (i = 0; i < 4; i++)
        {
            work = 1;
            for (j = 0; j < 32; j++)
            {
                if ((work & parity[i]) != 0)
                {
                    this.sfmt[i] ^= work;
                    return;
                }

                work = work << 1;
            }
        }
    }
}