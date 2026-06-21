import Image from "next/image";
import Executives from "@/public/images/executives.jpg";

export default function Home() {
  return (
    <>
      <header className="relative flex w-screen h-[600px] mx-auto overflow-hidden">
        
        <div className="absolute inset-0 z-0">
          <Image 
            src={Executives} 
            alt="Executives" 
            fill 
            className="object-cover blur-lg" 
          />
        </div>

        <div className="absolute inset-0 bg-black/80"/>

        <nav className="absolute top-0 left-0 w-full p-5 z-20">
          <div className="flex">
            <p className="mr-10 text-white font-light text-2xl">Recrible</p>
            <ul className="flex mx-auto gap-12 text-gray-200 text-xl font-light">
              <li>Accueil</li>
              <li>Jobs</li>
              <li>Contact</li>
            </ul>
            </div>
        </nav>
        <h1 className="text-white text-center z-10">Trouvez votre Job de rêve</h1>
      </header>

      <main className="p-10">
        <section>test</section>
      </main>
    </>
  );
}