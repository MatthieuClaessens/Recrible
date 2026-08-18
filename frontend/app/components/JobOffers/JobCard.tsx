import { JobOffer } from "../../types/JobOffer"

export default function JobCard() {
    return (
        <>
            <div className="bg-[#171717] border border-[#262626] rounded-2xl p-6 text-white">
                <p className="text-white text-2xl font-semibold">Ingénieur Back-End</p>
                <p className="text-[#D4D3D3] font-semibold">Lorem ipsum</p>
                <p className="text-[#B1B1B1] pt-3">Dolor sit amet, consectetur adipiscing elit, sed do eiusmod.</p>
            </div>
            <div className="bg-[#171717] border border-[#262626] rounded-2xl p-6 text-white">
                <p className="text-white">Carte offre 2</p>
            </div>
            <div className="bg-[#171717] border border-[#262626] rounded-2xl p-6 text-white">
                <p className="text-white">Carte offre 3</p>
            </div>
            <div className="bg-[#171717] border border-[#262626] rounded-2xl p-6 text-white">
                <p className="text-white">Carte offre 4</p>
            </div>
        </>
    );
}