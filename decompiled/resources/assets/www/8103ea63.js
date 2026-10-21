import{z as e,a8 as t,aX as a,L as i,ak as r,b6 as l,bG as n,h as s,aV as o,i as b}from"./952f98a9.js";import{C as d}from"./216055dc.js";import{B as c}from"./c37db1d9.js";import{aC as v}from"./7f3d7ca9.js";customElements.define(c.is,c),customElements.define(v.is,v);const m="#043263";var f=e`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-card-article-header-img-height: 45vw;
  --bbva-card-article-box-shadow: none;
  --bbva-card-article-bg-color-pressed: token("foundations.colors.primaryCoreLightened");
  --bbva-card-article-title-color-pressed: token("foundations.colors.primaryMedium");
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-link {
  padding: var(--bbva-widget-faqs-detail-bbva-link-padding, 0 0 1rem 1rem);
  color: var(--bbva-widget-faqs-detail-bbva-link-color, var(--bbva-dark-medium-blue, var(--colorsPrimaryMedium, ${t("#1973B8")})));
}

bbva-list-bullet {
  margin-left: var(--bbva-widget-faqs-detail-bbva-list-bullet-margin-left, -0.3125rem);
}

bbva-link:active {
  color: var(--bbva-widget-faqs-detail-bbva-link-active-color, var(--bbva-dark-core-blue, var(--colorsPrimaryCoreDark, ${t(m)})));
}
`;class h extends(a(d(i))){static get is(){return"bbva-widget-faqs-detail"}static get styles(){return[f,r("bbva-widget-faqs-detail-shared-styles")]}static get properties(){return{faq:{type:Object}}}static get scopedElements(){return{"bbva-banner-video":v,"bbva-card-article":c,"bbva-link":l,"bbva-list-bullet":n}}constructor(){super(),this.faq=null}get _videoTemplate(){const e=this.faq.header;return e&&e.type&&"video"===e.type?s`<bbva-banner-video url-image="${e.url}"></bbva-banner-video>`:o}get _cardTemplate(){const e=this.faq.header&&this.faq.header.type&&"image"===this.faq.header.type?this.faq.header.url:"";return s`
      <bbva-card-article
        expanded fixed
        id="${this.faq.id}"
        image="${e}"
        category="${b(this.faq.family&&this.faq.family.name)}"
        category-text="${b(this.faq.family&&this.faq.family.name)}"
        image-accesibility-text="${b(this.faq.alternativeTitle)}"
        category-icon="${b(this.faq.family&&this.faq.family.asset)}"
        title="${this.faq.title}">    
        ${this._answerTemplate}
      </bbva-card-article>
    `}get _answerTemplate(){const e={"list-bullet":e=>e.content.map((e=>s`<bbva-list-bullet>${e}</bbva-list-bullet>`)),default:e=>e.content.map((t=>{const a=document.createElement(e.type);return a.innerHTML=t,s`${a}`}))};return this.faq.answer.flatMap((t=>(e[t.type]||e.default)(t)))}get _faqTemplate(){return s`
      ${this._videoTemplate}
      ${this._cardTemplate}
      ${this._linkTemplate}
      ${this._nativeLinkTemplate}
    `}get _linkTemplate(){return this.faq.link?s`<bbva-link 
          @click=${()=>this._emit("bbva-widget-faqs-detail-link-click",{url:this.faq.link.url})}
        >${this.faq.link.text}</bbva-link>`:o}get _nativeLinkTemplate(){return this.faq.nativeLink?this._createNativeLinkTemplate(this.faq.nativeLink):o}_createNativeLinkTemplate(e){const t=e.iconSize?e.iconSize:0,a=e.iconNativeLink?e.iconNativeLink:"";return s`<bbva-link icon=${a} icon-size=${t} @click=${()=>this._emit("bbva-widget-faqs-detail-native-link-click",this._nativeLinkEventConfig(e))}>${e.text}</bbva-link>`}_nativeLinkEventConfig(e){return{value:e.url,mimeType:e.mimeType,title:e.text,headerColor:e.headerColor?e.headerColor:"FFFFFFFF",tintColor:e.tintColor?e.tintColor:"FF072146",canShare:!e.canShare||e.canShare,titleColor:e.titleColor?e.titleColor:"FF072146",blackStatusBar:!!e.blackStatusBar}}documentNativeLinkOpenSuccess(){this._emit("bbva-widget-faqs-detail-native-link-open-close-veil",{detail:!0})}documentNativeLinkOpenError(){this._emit("bbva-widget-faqs-detail-native-link-open-close-veil",{detail:!0})}render(){return s`
      ${this.faq?this._faqTemplate:o}
    `}_emit(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(h.is,h);
