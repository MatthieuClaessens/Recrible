import Image from "next/image";
import ZaidSchwartz from "@/public/images/zaid-schwartz.png";

export default function HeroSection() {
    return (
        <header>
            <div className="max-w-7xl mx-auto w-full px-10 mt-12 grid grid-cols-1 lg:grid-cols-12 items-center gap-12">
                <div className="lg:col-span-8">
                    <h1 className="text-black text-6xl font-semibold leading-tight">
                        Trouvez le poste<br />
                        qui vous <span className="text-[#2563EB]">ressemble</span>.
                    </h1>
                    <p className="mt-5 text-gray-600">
                        Des milliers d'opportunités tech, design, produit et data.<br />
                        Une recherche précise, des filtres puissants, et des offres qui <span className="text-[#2563EB]">matchent</span> vraiment vos ambitions.
                    </p>
                    <div className="flex gap-12 mt-10 text-5xl font-semibold">
                        <div>
                            <p>10 000+</p>
                            <p className="text-sm text-center text-[#9F9F9F] font-normal mt-1">offres actives</p>
                        </div>
                        <div>
                            <p>1500</p>
                            <p className="text-sm text-center text-[#9F9F9F] font-normal mt-1">entreprises</p>
                        </div>
                    </div>
                </div>

                <div className="lg:col-span-4 flex justify-end items-end">
                    <Image
                        src={ZaidSchwartz}
                        alt="Zaid Schwartz"
                        className="w-full max-w-[3600px] h-auto object-contain"
                    />
                </div>
            </div>
        </header>
    );
}