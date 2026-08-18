import { Search, MapPin} from 'lucide-react';

export default function JobSearchBar() {
    return (
        <div className="bg-[#171717] rounded-full p-3 flex items-center gap-3 shadow-xl w-full">

            <div className="bg-[#262626] rounded-full h-15 flex-1 flex items-center px-6 gap-3">
                <Search className="text-[#B4B4B4] w-5 h-5 flex-shrink-0" />
                <input
                    type="text"
                    placeholder="Poste, compétence ou entreprise"
                    className="bg-transparent text-white w-full outline-none placeholder-[#B4B4B4]"
                />
            </div>

            <div className="bg-[#262626] rounded-full h-15 flex-1 flex items-center px-6 gap-3">
                <MapPin className="text-[#B4B4B4] w-5 h-5 flex-shrink-0" />
                <input
                    type="text"
                    placeholder="Ville ou télétravail"
                    className="bg-transparent text-white w-full outline-none placeholder-[#B4B4B4]"
                />
            </div>

            <button className="bg-white text-black rounded-full h-15 px-8 hover:bg-gray-200 transition-colors font-medium whitespace-nowrap cursor-pointer">
                Rechercher
            </button>
        </div>
    )
}