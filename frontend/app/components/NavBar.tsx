import Link from "next/link";

export default function NavBar() {
    return (
    <nav className="max-w-7xl mx-auto h-20 bg-[#EEEEEE] flex flex-row items-center justify-center rounded-b-3xl">
        <h3 className="font-semibold text-3xl pl-10">Re<span className="text-[#2563EB]">crible</span></h3>
        <ul className="flex flex-row gap-10 mx-auto">
            <li className="font-semibold text-xl cursor-pointer">Offres</li>
            <li className="font-semibold text-xl cursor-pointer">Entreprises</li>
            <li className="font-semibold text-xl cursor-pointer">Salaires</li>
            <li className="font-semibold text-xl cursor-pointer">Ressources</li>
        </ul>
        <div className="gap-2 flex flex-row pr-10">
            <Link href={"/"} className="bg-white hover:shadow-lg active:scale-95 transition-all duration-200 ease-in-out px-6 py-2 outline-1 outline-[#9F9F9F] rounded-full inline-block">
                <p>Je recrute</p>
            </Link>
            <Link href={"/"} className="bg-black hover:shadow-lg active:95 transition-all duration:200 ease-in-out text-white px-6 py-2 rounded-full">
                <p>Se connecter</p>
            </Link>
        </div>
    </nav>
);
}