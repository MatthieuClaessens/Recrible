import JobCard from "./JobCard";
import SearchBar from "./JobSearchBar";
import { SlidersHorizontal } from "lucide-react";

export default function JobOffers() {
    return (
        <div className="bg-black w-full min-h-screen md:-mt-15 z-20 absolute">
            <div className="max-w-7xl mx-auto px-10 relative -mt-13 z-30 mb-20">
                <SearchBar />
            </div>
            <div className="max-w-7xl mx-auto px-10">
                <div className="grid grid-cols-1 lg:grid-cols-12 gap-8 items-start">

                    <div className="lg:col-span-4 lg:sticky lg:top-8 z-10">
                        <div className="bg-[#171717] border border-[#262626] rounded-2xl p-6 text-white">
                            <h3 className="font-semibold text-lg mb-6 flex gap-2">
                                <SlidersHorizontal /> Filtres
                            </h3>
                            <div className="space-y-4 text-gray-400 text-sm">
                                <p className="uppercase">Type de contrat</p>
                                <p>CDI</p>
                            </div>
                        </div>
                    </div>
                    <main className="lg:col-span-8">
                        <div className="flex justify-between items-center mb-6 text-white">
                            <p className="text-xl font-medium">12 offres trouvées</p>
                            <span className="text-gray-400 text-sm">Trier par : Plus récentes</span>
                        </div>
                        <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
                            <JobCard />
                        </div>
                    </main>
                </div>
            </div>
        </div>
    );
}