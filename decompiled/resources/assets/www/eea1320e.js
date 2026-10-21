import{z as i,L as e,ak as s,h as t,aU as r}from"./952f98a9.js";import{C as l}from"./216055dc.js";import"./f2cca372.js";var a=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class d extends(l(e)){static get is(){return"bbva-aggregation-file-list"}static get properties(){return{listFile:{type:Array,attribute:"list-file"}}}constructor(){super(),this.listFile=[]}static get styles(){return[a,s("bbva-aggregation-file-list-shared-styles")]}reset(){this.listFile=[]}_renderDivider(i,e){return i?t`<bbva-divider id="bbva-divider-${e}" size=${i}></bbva-divider>`:""}_fileClicked(i){this.dispatchEvent(new CustomEvent("list-file-clicked",{detail:i.target.id,composed:!0,bubbles:!0}))}render(){return t`
      ${this.listFile.map(((i,e)=>t`
        <div class="container-list-file">
          <bbva-list-file
            id="bbva-list-file-${i.id||e}"
            icon="${i.icon||r()}"
            file-name="${i.fileName||""}"
            file-size="${i.fileSize||""}"
            info-message="${i.infoMessage||""}"
            error-message="${i.errorMessage||""}"
            ?checkbox="${i.checkbox||!1}"
            status="${i.status||""}"
            @list-file-link-click="${this._fileClicked}">
          </bbva-list-file>
          ${this._renderDivider(i.dividerSize,e)}
        </div>
        `))}
    `}}customElements.define(d.is,d);
