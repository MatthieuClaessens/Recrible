import Link from "next/link";
import Image from "next/image";

import ZaidSchwartz from "@/public/images/zaid-schwartz.png";

export default function Home() {
    return (
        <header className="w-full bg-white p-16">
            <div className="absolute top-0 left-0 w-full z-20">
                <nav
                    className="max-w-7xl mx-auto h-20 bg-[#EEEEEE] flex flex-row items-center justify-center rounded-b-3xl">
                    <h3 className="font-semibold text-3xl pl-10">Re<span className="text-[#2563EB]">crible</span></h3>
                    <ul className="flex flex-row gap-10 mx-auto">
                        <li className="font-semibold text-xl cursor-pointer">Offres</li>
                        <li className="font-semibold text-xl cursor-pointer">Entreprises</li>
                        <li className="font-semibold text-xl cursor-pointer">Salaires</li>
                        <li className="font-semibold text-xl cursor-pointer">Ressources</li>
                    </ul>
                    <div className="gap-2 flex flex-row pr-10">
                        <Link href={"/"} className="bg-white px-6 py-2 outline-1 outline-[#9F9F9F] rounded-full">
                            <p>Je recrute</p>
                        </Link>
                        <Link href={"/"} className="bg-black text-white px-6 py-2 rounded-full">
                            <p>Se connecter</p>
                        </Link>
                    </div>
                </nav>
                <div className="max-w-7xl mx-auto w-full px-10 mt-12 grid-cols-2 grid">
                    <div>
                        <h1 className="text-black text-6xl font-semibold leading-tight">Trouvez le poste<br/>
                            qui vous <span className="text-[#2563EB]">ressemble</span>.</h1>
                        <p className="mt-5">Des milliers d'opportunités tech, design, produit et data.<br/>
                            Une recherche précise, des filtres puissants, et des offres qui <span
                                className="text-[#2563EB]">matchent</span> vraiment vos ambitions.</p>
                        <div className="flex gap-8 grid-rows-2 mt-10 text-5xl font-semibold">
                            <div>
                                <p>10 000+</p>
                                <p className="text-sm text-center">offres actives</p>
                            </div>
                            <div>
                                <p>1500</p>
                                <p className="text-sm text-center">entreprises</p>
                            </div>
                            <div>
                            </div>
                        </div>
                    </div>
                    <div>
                        <Image src={ZaidSchwartz} alt="Zaid Schwartz" className="-mt-10 w-125"/>
                    </div>
                </div>
            </div>
        </header>
    );
}